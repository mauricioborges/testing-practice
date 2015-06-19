Given(/^a search website$/) do
    visit('http://www.google.com')
    save_screenshot('itworks.png')
end

