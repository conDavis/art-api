<h1>API returning art made by me (Con)!</h1>
Hosted by Heroku at: https://secret-basin-38348.herokuapp.com/
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
Pieces are represented by their name, a url for an image of the piece, and a numeric ID, json formatted.<br/>
Example: {"name":"Breathe in the Present","url":"https://drive.google.com/uc?id=1HrHlhBGF7Y6uzYJwmlLyXhqQQ_kaM0cH
","id":3}

<h2>Endpoints</h2> 
<b>/random<br/></b>
Get representation for a random art piece.<br/>
<br/>

<b>/all</b><br/>
Get array containing objects representing all art pieces.<br/>  

<b>/piece</b><br/>
Get representation for piece by name or ID, if no name or ID is given this path returns a default value "Self Portrait 2020". <br/>
<img src="https://drive.google.com/uc?id=1L-e28HJnaDveW_i_F3A6ImUPZ_PSadmv" alt="self portrait 2020" width="200"/>

<b>/piece/?name={pieceName}</b><br/>
Get representation for piece with the given name. Not case sensitive.  

<b>/piece/?id={id}</b><br/>
Get representation for piece with the given id.

Note: if ID and name are provided for a /piece query, the id will take precedence over the name given.
