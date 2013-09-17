text = '''The Python Software Foundation and the global Python 
community welcome and encourage participation by everyone. Our community is based on 
mutual respect, tolerance, and encouragement, and we are working to help each other live up 
to these principles. We want our community to be more diverse: whoever you are, and 
whatever your background, we welcome you.'''

text = text.replace(".", "").replace(",", "").replace("\n", "").replace(":", "")

words = text.split(" ")

result = 0

for word in words:
    if len(word) > 4:
        for letter in "python":
            if word.lower().find(letter) != -1:
                result += 1
                break
        
print (result)
