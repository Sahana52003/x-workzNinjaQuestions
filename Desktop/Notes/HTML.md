# &nbsp;	       HTML



Web Development:

&nbsp;	is the process of building and maintaining website or web applications .Web development uses various programming languages, frameworks to create website.



Web Server:

&nbsp;	refers to both hardware and software responsible for storing and delivering website data.



URL(uniform resource locator):

&nbsp;	is the address used to access resources on the web such as website,images,or files.

1. Protocol:https://   or http://
2. Domain :amazon.com
3. path:/menu
4. Query parameter: ?id=23



cookies:

&nbsp;	are small piece of data stored by your browser that can help remember your login details or keep track of items in your cart.



======>Introduced by **Tim Berners Lee(1989-1990)**

Hyper link===>Bolder line

Hyper text===>Bolder text







**HTML:**

	**HTML stands for HyperText Markup Language.**

**It is the standard language used to create and structure web pages on the internet.**

**(**OR**)**

&nbsp;	HTML, or HyperText Markup Language, is the standard language used to create and design web pages. It provides the basic structure of a website by using tags to define elements such as headings, paragraphs, images, links, and tables. HTML acts as the backbone of any webpage, telling the browser how to display content. Without HTML, web pages would not have a proper structure or organized presentation.

        

**HyperText → refers to text that contains links (hyperlinks) to other text or resources.**

**Markup → means it uses special tags (like <p>, <h1>, <a>, etc.) to define the structure and meaning of content.**

**Language → it follows specific rules (syntax) to describe how elements should appear and relate.**



**Structure of HTML:**

<!DOCTYPE html>

<html>

<head>

&nbsp; <title></title>

</head>

<body>

&nbsp; <h1></h1>

&nbsp; <p></p>

</body>

</html>



&nbsp;	<!DOCTYPE html> → Declares the document type and tells the browser it’s an HTML5 document.



<html> → The root element; everything in the page goes inside this tag.



<head> → Contains information about the page (not shown directly on the webpage), such as the title, metadata, styles, and scripts.



Example: <title>My Page</title> sets the title shown in the browser tab.



<body> → Contains the actual content that appears on the webpage, like headings, paragraphs, images, links, forms, etc.



**Difference between HTML and XML**



**HTML                                                                XML**

1.HTML stands for HYPER TEXT MARKUP LANGUAGE.                 1.XML stands for EXTENSIBLE MARKUP LANGUAGE.

2.Used to display data in a web browser.                      2.Used to store and transport data.

3.IT is not a case sensitive.                                 3.It is a case sensitive.

4.Tags are used to display the data.                          4.Tags are used to describe data.

5.They are predefined tags(E.g <h1>,<p>,<div.)                5.User-defined tags (eg. <book>,<price>).

6.Flexible syntax, missing tags are often tolerated.          6.Required strict syntax, every tags must be closed properly.

7.designed for visual presentation.                           7.Doesnot display content visually.

8.Follows a fixed structure for rendering.                    8.No predefined structure ,very flexible.





**Tags in HTML**



1. **paired tags :**
1. 
**&nbsp;**		Opening and closing tags .<></>



**2. Unpaired tags:**

		Only opening tags <>.







**Formatting tags:**

		

&nbsp;	Formatting tags in HTML are used to change the appearance and style of text on a webpage. They help in emphasizing certain parts of content by making text bold, italic, underlined, highlighted, or smaller. These tags also allow adding effects like superscript, subscript, strikethrough, and inserted text. In short, formatting tags make web content more readable, structured, and visually clear.





1. <b> → Makes the text bold but does not give any special meaning. It is only for styling.

Example: <b>Hello</b> → Hello



2\. <strong> → Makes the text bold and also indicates that the text is important.

Example: <strong>Warning</strong> → Warning



3\. <i> → Displays the text in italic style, mostly for decorative purposes.

Example: <i>Note</i> → Note



4\. <em> → Displays the text in italic but also adds emphasis, giving it more importance.

Example: <em>Do this</em> → Do this



5\. <u> → Underlines the text.

Example: <u>Important</u> → <u>Important</u>



6\. <mark> → Highlights the text like a marker.

Example: <mark>Highlight me</mark> → <mark>Highlight me</mark>



7\. <small> → Makes the text smaller in size compared to normal text.

Example: <small>Small text</small> → <small>Small text</small>



8\. <sup> → Displays text as superscript, useful for powers in math.

Example: x<sup>2</sup> → x²



9\. <sub> → Displays text as subscript, useful in chemical formulas.

Example: H<sub>2</sub>O → H₂O



10\. <del> → Shows deleted text with a strikethrough.

Example: <del>Old</del> → Old



11\. <ins> → Shows inserted text with an underline to indicate addition.

Example: <ins>New</ins> → <ins>New</ins>



12\. <pre>->The <pre> tag in HTML is used to display preformatted text.

It preserves spaces, tabs, and line breaks exactly as they are written in the code, unlike normal HTML where multiple spaces or new lines are ignored.

Example:<pre>

This text keeps

&nbsp;   its spaces and

line breaks exactly

&nbsp;       as written.

</pre>

&nbsp;  







**Attributes:**

	

	In HTML, attributes are extra pieces of information added to tags that help control the behavior or appearance of elements. They are always written inside the opening tag and usually come in a name="value" format. Attributes modify how an element works, such as giving it an identifier, a style, a link, or alternative text. In short, attributes provide additional details about an element.

&nbsp;	Example:

<img src="flower.jpg" alt="A red flower" width="200" height="150">

