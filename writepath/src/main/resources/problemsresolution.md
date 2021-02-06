'''Hint: this often means that some other annotation processor was supposed to process the erroneous element. You can also enable 
MapStruct verbose mode by setting -Amapstruct.verbose=true as a compilation argument.'''

Problems with IDEA Intellij
Add 
-Djps.track.ap.dependencies=false
which should be added to File | Settings | Build, Execution, Deployment | Compiler | Build process VM options field.
See here
https://youtrack.jetbrains.com/issue/IDEA-250718#focus=Comments-27-4418347.0-0

Also care needs to be taken when configuring version of lombok and mapstruct. 