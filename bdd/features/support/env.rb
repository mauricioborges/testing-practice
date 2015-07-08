require 'capybara/cucumber'
require 'capybara/poltergeist'

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

def network_traffic
    page.driver.network_traffic
end
