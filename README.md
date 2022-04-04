# drools-demo
Small repository to record examples and leanings around using the drools rules engine.

drools basics - tutorial: https://www.baeldung.com/drools

- Facts – represents data that serves as input for rules
- Working Memory – a storage with Facts, where they are used for pattern matching and can be modified, inserted and removed
- Rule – represents a single rule which associates Facts with matching actions. It can be written in Drools Rule Language in the .drl files or as Decision Table in an excel spreadsheet
- Knowledge Session – it holds all the resources required for firing rules; all Facts are inserted into session, and then matching rules are fired
- Knowledge Base – represents the knowledge in the Drools ecosystem, it has the information about the resources where Rules are found, and also it creates the Knowledge Session
- Module – A module holds multiple Knowledge Bases which can hold different sessions