if ENV["FUNCTIONAL"] then
    Dir["./steps/functional/*.rb"].each {|file| require file }
else
    require 'capybara/cucumber'
    require 'capybara/poltergeist'
    Dir["./steps/web/*.rb"].each {|file| require file }
    if ENV["HEADLESS"] then
        Capybara.register_driver :poltergeist do |app|
            Capybara::Poltergeist::Driver.new(app, window_size: [1280, 1024], debug: true)
        end
        Capybara.default_driver    = :poltergeist
        Capybara.javascript_driver = :poltergeist
    else
        Capybara.default_driver = :selenium
    end
    Capybara.default_selector = :css
end
 
