#reversing each eord of a paragraph using recursion
def reverse_words(s):
    if len(s)==0:
        return ""
    
    return reverse_words(s[1:])+s[0] 

# Example usage:
paragraph = input().split()
a=""
for i in range(len(paragraph)):
    if i== len(paragraph)-1:
        a+=reverse_words(paragraph[i])
    else:
        a+=reverse_words(paragraph[i])+" "
print(a)
