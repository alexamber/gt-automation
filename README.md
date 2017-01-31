This is a sample project of UI and WS test automation using:
- gradle
- selenium
- jbehave
- apache http client
- assertj assertions

Some tricky stuff was implemented to generalize and simplify automated tests design and step's implementation:
- distributed structure of pages using internal blocks, called panels
- custom elements for web UI
- jbehave reports with screenshots for failed tests
- custom parameter converters for scenario steps
- test session, used for data transfer between steps
- simple http client for convenient testing of restful services

Test platforms:
- www.olx.ua
- www.bookingpal.com

How to execute?
1. Clone project
2. Ensure you have:
    - java 1.8
    - latest gradle
3. Run from project root: gradle clean test -Dstories=${YOUR_STORIES_TO_BE_EXECUTED_PATTERN}, i.e. gradle clean test -Dstories=*.story

