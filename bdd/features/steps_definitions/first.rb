Given(/^a search website$/) do
    visit('http://www.google.com')
    network_traffic.response
    save_screenshot('itworks.png')
end

