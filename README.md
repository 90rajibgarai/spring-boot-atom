# spring-boot-atom

What is ATOM ?
----------------------------------------------------------------------
Atom is the name of an XML-based Web content and metadata syndication format, and an application-level protocol for publishing and editing Web resources belonging to periodically updated websites.

Atom is a relatively recent spec and is much more robust and feature-rich than RSS. For instance, where RSS requires descriptive fields such as title and link only in item breakdowns, Atom requires these things for both items and the full Feed.

All Atom Feeds must be well-formed XML documents, and are identified with the application/atom+xml media type.

The OData protocol is comprised of a set of specifications for representing and interacting with structured content. This document describes the OData Atom Format returned from an OData Service when requesting the application/atom+xml mime type.

Structure of an Atom 1.0 Feed :
-------------------------------

    <?xml version="1.0"?>
    <feed xmlns="http://www.w3.org/2005/Atom">
       <title>...</title>
       <link>...</link>
       <updated>...</updated>

       <author>
          <name>...</name>
       </author>

       <id>...</id>

       <entry>
          <title>...</title>
          <link>...</link>
          <id>...</id>

          <updated>...</updated>
          <summary>...</summary>
       </entry>
    </feed>
  
--------------------------------------------------------------------------
Reference Doc :
--------------------------------------------------------------------------

The Atom Publishing Protocol              : https://bitworking.org/projects/atom/rfc5023/

Atom Format (OData Version 2.0)           : https://www.odata.org/documentation/odata-version-2-0/atom-format/

Atom Format (OData Version 3.0)           : https://www.odata.org/documentation/odata-version-3-0/atom-format/

Atom feeds with Spring framework          : https://golb.hplar.ch/2017/01/Produce-RSS-and-Atom-feeds-with-Springframework.html

Others : https://howtodoinjava.com/spring-boot/spring-boot-rome-rss-and-atom-feed/

https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/atom-feed-view.html

https://spring.io/blog/2009/03/16/adding-an-atom-view-to-an-application-using-spring-s-rest-support

https://www.concretepage.com/spring-4/spring-4-mvc-atom-and-rss-feed-example-with-rome-using-javaconfig

https://memorynotfound.com/spring-mvc-rss-atom-content-negotiation/
                                          
---------------------------------------------------------------------------
Screen shots :
---------------------------------------------------------------------------

<img src="https://github.com/90rajibgarai/doc-important-links/blob/master/Architectures/Spring Boot with ATOM/GET-ALL-CLIENTS.jpg">
<img src="https://github.com/90rajibgarai/doc-important-links/blob/master/Architectures/Spring Boot with ATOM/GET-ALL-ADDRESS-BY-CLIENT-NAME.jpg">
<img src="https://github.com/90rajibgarai/doc-important-links/blob/master/Architectures/Spring Boot with ATOM/GET-ALL-INVOICESS-BY-ORDER-ID.jpg">
