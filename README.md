<h1>API returning art made by me!</h1>

<h2>Requirements</h2>
- [git](https://git-scm.com/downloads)
- [JDK 1.8](https://www.oracle.com/java/technologies/downloads/) or later
- [Maven 3.2+](https://maven.apache.org/download.cgi)

<h2>Setup</h2> 
- clone repo </br>
- cd repo dir </br> 
- ./mvnw spring-boot:run </br> 

<h2>Endpoints</h2> 
/random
Get info for random art piece including link to image, name, and ID number.
/all
Get array containing info for all art pieces. 
/piece/?{pieceName}
Get info for piece with the given name. Not case sensitive. Default value "Self Portrait 2020".

