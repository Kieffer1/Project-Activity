import pyttsx3

robot = pyttsx3.init()

text = input("Enter a text")

robot.say(text)

robot.runAndWait()

