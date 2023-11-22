pipeline{
     agent{
        docker{
           image "openjdk:11"
        }
      }  
     stages{
       stage("Build"){
         steps{
           //compile and buildur java project
           sh 'javac pattern.java'
         }
       }

       stage("Run pattern code"){
          steps{
           //Run ur java code 
           sh "java pattern.java"     
          }
        }
      }
    }
