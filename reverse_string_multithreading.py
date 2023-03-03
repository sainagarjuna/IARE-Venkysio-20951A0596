#multi-threading in python
import threading

def rev_word(word, results):
        
    results.append(word[::-1])
    #print(results)

def reverse_para(para):
    words = para.split()
    results = []
    threads = []
    for word in words:
        t = threading.Thread(target=rev_word, args=(word, results))   #thread intialization
        #print(t)
        t.start()
        threads.append(t)            #new thread created is added to threads
        #print('hero:'threads)
    for t in threads:
        #print(t)                   # new thread is concatenated to previous thread and thread is stopped
        t.join()        
        
    #print(results)                    # output in form of array
    reversed_para = ' '.join(results)
    return reversed_para

paragraph = input("Enter a para: ")
reversed_paragraph = reverse_para(paragraph)
print(reversed_paragraph)
