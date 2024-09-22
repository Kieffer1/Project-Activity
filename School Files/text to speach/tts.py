from gtts import gTTS
import os

text = input("Enter a word: ")

tts = gTTS(text=text)

tts.save("output.mp3")

os.system("mpg321 output.mp3")