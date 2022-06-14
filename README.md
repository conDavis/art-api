<h1>API returning art made by me (Con)!</h1>

<h2>Requirements</h2>
<ul>
  <li>[git](https://git-scm.com/downloads)</li>
  <li>[JDK 1.8](https://www.oracle.com/java/technologies/downloads/) or later</li>
  <li>[Maven 3.2+](https://maven.apache.org/download.cgi)</li>
</ul>

<h2>Setup</h2> 
<ul> 
  <li> clone repo</li>
  <li> cd repo dir</li>
  <li> ./mvnw spring-boot:run</li>
</ul>
<h2> Data Format </h2> 
Pieces are represented by their name, an id, and a link to an image of the piece, json formatted.

<h2>Endpoints</h2> 
<b>/random<br/></b>
Get representation for a random art piece including link to image, name, and ID number.<br/>
<br/>

<b>/all</b><br/>
Get array containing objects representing all art pieces.<br/>  

<b>/piece/?{pieceName}</b><br/>
Get representation for piece with the given name. Not case sensitive. Default value "Self Portrait 2020".  

