# Dashboard
---
## Homework
 - ENG 1: 17-18
 - PHY 2: DONE
 - ALG 3: Study, packets
 - -CS 4: HW
 - ZHO 5: DONE
 - OFF 6: NONE
 - HST 7: DONE

 - W:
   - #a52b27 -> #FF802B
   - #752927 -> #802BFF
   - Fix main BaseBoard
   - Talk about an actual server setup
   
 - C:
   - Algorithms
   - Data Structures
   - Threading
   - Memory Management
   - Specialties
   - Practical Programming
   - Servers/APIs
---
## Tomorrow
1: READY
3: NOT READY (TEST)
4: READY
6: READY
7: NOT READY

2: READY
5: READY


## English paper mistakes
 - Period at the end of a quote
 - capitalization of god/God
 - Book title in italics
 - present tense
 - p. before page number
 - counterarguments
 - never use a . before a quotation
 - Use a colon when something that comes after the colon amplifies what came before
 - Who vs. whom
   - Ex. Then we become whom* others expect us to be.
   - Whom if it's an object
---
## Web Design
 - Protocol - Sam
   - Product pages


---
## Projects
 - Learn Programming
 - Protocol
 - Vending Machine
   - Credits System
     - Add order STL
     - Add Transfer funds



  - pythonize?
    - deploy script      : yes
    - actual thing       : nah
    - serverside manager : maybe

  - interface:
    - Title at top, with link to timelapse of yesterday
    - Link to file directory
    - Links to other spycams

  - server side
    - executes at the end of every day
    - creates timelapse
    - compresses files into archive with date as name

  - spycam deploy script -- python
    - copy spycam script to location
    - create LaunchAgent plist
    - generate ssh keys
    - send pubkey to a listener
    - initialize job
    - remove deploy script
    - set a delay for pictures
    - set 7AM - 6PM or not

  - spycam script
    - take picture
    - copy to mserver4
    - remove images
    - wait

---
```

:                      :
::                    ::
::`.     .-""-.     .'::
: `.`-._ : '>': _.-'.' :
:`. `=._`'.  .''_.=' .':
 : `=._ `- '' -' _.-'.:
  :`=._`=.    .='_.=':
   `.._`.      .'_..'
     `-.:      :.-'
        :      :
        `:.__.:'
         :    :
        -'=  -'=
BURD

```




- Reddit bot
  - directives.csv  
    - repost (sub to search, sub to post to, queuefile)
    - post (sub to post to, queuefile)
  - config.csv
    - how often to repost
    - how long to sleep in between loops
    - directives.csv location
    - queue directory location
    - username
    - password
    - user agent string
  - queue.csv
    - sub to post to
    - title
    - url
  - these functions should take the redditor as an argument to use its functions
  - post.py
    - contains functions to post from a queue
  - search.py
    - contains functions to search from directives
    - contains functions to write to email confirm / create a confirm file
  - bot.py
    - logs in
    - starts loop
    - runs search and post files
    - regularly checks if reddit is down

FOR SCIENCE
