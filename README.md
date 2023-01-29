## Inspiration
When you are going through a tough time, it's comforting when a friend sends you a virtual hug. Even if they are not there physically, you can see that they care. Wave is inspired by these little things in life that make a huge difference. Sometimes, even the smallest gestures can be enough to keep friendships and relationships special and long-lasting.

## What it does
Wave: It's the little things in life — is a simple 3-step addition to your daily messaging habits. Virtual hugs, or in our case - handshakes, have never felt so genuine and interactive! 

###### Wave
_It's very simple._

| Simple 3-step process | Details |
|-------|-----|
| 1. Select a Friend | Open the navigation bar to select a friend from your contact list. |
| 2. Shake your phone to select a gesture   | Wait for the prompt to start shaking your phone. Once it has successfully detected a hand shake, a prompt allows you to choose from a list of gestures: Hand Shake, High Five, Hand Wave, Jazz Hands etc. |
| 3. Show them you care   | Once a gesture has been selected, send it to your friend! Your friend will receive a real-time notification that you have sent them a gesture to show them that you are thinking of them. |

## How we built it
Currently, we fully implemented Wave as an Android application and integrated the main functionalities into the app. Using Kotlin and Java, we programmed a motion sensor to detect phone shaking movements. We also used XML scripts to implement our application's beautiful, simplistic front end, which matches our motto - it's the little things in life.

## Challenges we ran into
We are a team of 2 software engineers, so mobile development was definitely a learning curve. 

**Mobile Development:** Huge thank yous to our computers for not crashing on us while we ran a heavy android studio application. It was also tough for us to learn everything from scratch and code in an unfamiliar language (Kotlin).

**Motion Sensor:** We put a lot of time and effort into finding the perfect balance between the sensitivity and the timing of the motion sensors.

**Merging different Activities:** We mainly have 2 activities in our application - the navigation bar animation and the motion sensors. At first, we worked on the different components on our own, so when it came to merging the two activities together, it was a bit of a challenge.

**Dark mode and Light mode:** Android Studio allows us to develop our application front-end for both light mode and dark mode. This is an incredibly interesting feature. Unfortunately, this also meant a hurdle during our development of the app. While we had our phones connected to our Android, some design colors did not match what we expected from our code. After a few hours of debugging, we ultimately realized that our phone was in dark mode the entire time while we were coding for light mode.

**Sleep deprivation and abnormal caffeine levels:** For most of the hackathon, we were two highly caffeinated and sleep-deprived software developers.

Overall, we are happy to have taken a lot away from this experience and proud to have fully implemented the main functionalities within 24 hours.

## Accomplishments that we're proud of
Overcoming all the challenges! We also think it's very cool that we have implemented motion sensors into our app, which adds an interactive component to traditional text messaging. We also believe in the creativity and uniqueness of our idea. In essence, we hope this may bring joy to people's lives and be a simple reminder to everyone that sometimes, _it's just the little things in life that can make us happy._

## What's next for Wave
Our initial intention with Wave was to have it as an extension to already existing messaging applications. Similar to iMessage Games, it would serve as an extra functionality to elevate the experience of text messaging or, just in general, be a more interactive way for people to connect remotely. Here is the future for Wave
* Partner with messaging apps to add the Wave extension
* Add more sensitive motion sensors for different gestures. Imagine if every different motion corresponds to a different gesture.
* Real-time notification system: receive your friend's Wave in real-time as a pop-up notification every time they think of you and send you one.
