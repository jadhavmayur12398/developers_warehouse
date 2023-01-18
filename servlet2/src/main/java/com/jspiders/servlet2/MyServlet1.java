package com.jspiders.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n"
				+ "    <meta name=\"description\" content=\"Netflix Open Source\">\r\n"
				+ "    <meta name=\"title\" content=\"Netflix Open Source\">\r\n"
				+ "    <link rel=\"shortcut icon\" href=\"https://assets.nflxext.com/us/ffe/siteui/common/icons/nficon2015.ico\">\r\n"
				+ "\r\n"
				+ "    <title>Netflix Open Source Software Center</title>\r\n"
				+ "\r\n"
				+ "    <!-- Bootstrap core CSS -->\r\n"
				+ "    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "\r\n"
				+ "    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n"
				+ "    <!--[if lt IE 9]>\r\n"
				+ "      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n"
				+ "      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n"
				+ "    <![endif]-->\r\n"
				+ "\r\n"
				+ "    <!-- Custom styles for this template -->\r\n"
				+ "    <link href=\"css/carousel.css\" rel=\"stylesheet\">\r\n"
				+ "    <link href=\"css/custom.css\" rel=\"stylesheet\">\r\n"
				+ "  </head>\r\n"
				+ "\r\n"
				+ "  <body>\r\n"
				+ "\r\n"
				+ "    <div class=\"masthead\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <div class=\"logo col-xs-6\">\r\n"
				+ "          <a href=\"/\"><img src=\"images/Netflix-OSS-Logo.png\" /></a>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"powered col-xs-6\">\r\n"
				+ "          <a href=\"/powered-by-netflix-oss.html\"><img src=\"images/Powered-By-Logo-Small.png\" /><p>POWERED BY</p></a>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <!-- Carousel\r\n"
				+ "    ================================================== -->\r\n"
				+ "    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n"
				+ "      <!-- Indicators -->\r\n"
				+ "      <ol class=\"carousel-indicators\">\r\n"
				+ "        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n"
				+ "        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n"
				+ "        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n"
				+ "      </ol>\r\n"
				+ "      <div class=\"carousel-inner\" role=\"listbox\">\r\n"
				+ "        <div class=\"item active\">\r\n"
				+ "          <img class=\"first-slide\" src=\"images/slider-bg-2.jpg\" alt=\"First slide\">\r\n"
				+ "          <div class=\"container\">\r\n"
				+ "            <div class=\"carousel-caption\">\r\n"
				+ "              <div class=\"col-md-8\">\r\n"
				+ "                <h2>JAX 2015 Award</h2>\r\n"
				+ "                <h3>Industry Awards!</h3>\r\n"
				+ "                <hr/>\r\n"
				+ "                <p>Netflix is honored to receive the Jury's choice award for Innovation at\r\n"
				+ "                  <a href=\"http://jaxenter.com/jax-awards-winners-announced-at-jax-2015-conference-116358.html\">JAX 2015 conference</a>.<p>\r\n"
				+ "                <p>We would like to thank all of those who contribute to the Netflix open source community including our Netflix developers, all external contributors,\r\n"
				+ "                  and our active user base.</p>\r\n"
				+ "                <p>Netflix Open Source won the JAX Special Jury Award.  Jury member Neal Ford was quoted as saying \"that architecture is\r\n"
				+ "                  cool again, that it can be used as a business differentiator, and when done right it is a huge advantage. Netflix showed the power of internalizing\r\n"
				+ "                  DevOps into their architecture; all architectures will do this in the future.\"</p>\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"col-md-4\">\r\n"
				+ "                <div class=\"carousel-image\">\r\n"
				+ "                  <img src=\"images/carousel/JAXawards_PostImage_398x298.jpg\" alt=\"First Slide Image\" />\r\n"
				+ "                </div>\r\n"
				+ "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"item\">\r\n"
				+ "          <img class=\"second-slide\" src=\"images/slider-bg-2.jpg\" alt=\"Second slide\">\r\n"
				+ "          <div class=\"container\">\r\n"
				+ "            <div class=\"carousel-caption\">\r\n"
				+ "              <div class=\"col-md-8\">\r\n"
				+ "                <h2>Getting Started</h2>\r\n"
				+ "                <h3>How can you get started quickly?</h3>\r\n"
				+ "                <hr/>\r\n"
				+ "                <p>For the simple approach, try out our <a href=\"http://techblog.netflix.com/2014/11/zerotodocker-easy-way-to-evaluate.html\">ZeroToDocker</a>\r\n"
				+ "                  container images. After downloading the images, you can be up and running NetflixOSS in just a few minutes.</p>\r\n"
				+ "                <p>After you've tackled that, check out the <a href=\"https://github.com/aspyker/acmeair-netflix\">IBM ACME Air</a>\r\n"
				+ "                  and <a href=\"https://github.com/cfregly/fluxcapacitor/wiki\">Flux Capacitor</a> apps, and the\r\n"
				+ "                  <a href=\"https://github.com/Netflix-Skunkworks/zerotocloud\">Zero-to-Cloud workshop.</a></p>\r\n"
				+ "                <p>See these <a href=\"http://answersforaws.com/resources/netflixoss/cloudformation/\">CloudFormation templates</a>\r\n"
				+ "                  on Answers For AWS for use of NetflixOSS through CloudFormation.</p>\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"col-md-4\">\r\n"
				+ "                <div class=\"carousel-image\">\r\n"
				+ "                  <img src=\"images/carousel/zero-to-docker-hero.png\" alt=\"Second Slide Image\" />\r\n"
				+ "                </div>\r\n"
				+ "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"item\">\r\n"
				+ "          <img class=\"third-slide\" src=\"images/slider-bg-2.jpg\" alt=\"Third slide\">\r\n"
				+ "          <div class=\"container\">\r\n"
				+ "            <div class=\"carousel-caption\">\r\n"
				+ "              <div class=\"col-md-8\">\r\n"
				+ "                <h2>Our Team</h2>\r\n"
				+ "                <h3>Want to work on this technology?</h3>\r\n"
				+ "                <hr/>\r\n"
				+ "                <p>If you are looking to have a large impact at a growing company and work with a high performance team - start here. Work with talented colleagues on hard problems that affect millions of customers.</p>\r\n"
				+ "    	        <p>At Netflix we value high performance, freedom and responsibility. We don't focus on rules, processes or procedures. We are candid and transparent and seek excellence in everything that we do.</p>\r\n"
				+ "	            <p>We tackle problems others have not been able to solve. We license great content, build systems at scale and use data to push the business forward. We connect people with movies and television globally.</p>\r\n"
				+ "                <p>Check out our <a href=\"https://jobs.netflix.com/\">jobs</a> page for current openings.</p>\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"col-md-4\">\r\n"
				+ "                <div class=\"carousel-image\">\r\n"
				+ "                  <img src=\"images/carousel/OpenSourceTeamMembersFountain-20150520.JPG\" alt=\"Third Slide Image\" />\r\n"
				+ "                </div>\r\n"
				+ "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n"
				+ "        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n"
				+ "        <span class=\"sr-only\">Previous</span>\r\n"
				+ "      </a>\r\n"
				+ "      <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n"
				+ "        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n"
				+ "        <span class=\"sr-only\">Next</span>\r\n"
				+ "      </a>\r\n"
				+ "    </div><!-- /.carousel -->\r\n"
				+ "\r\n"
				+ "    <!-- Marketing messaging and featurettes\r\n"
				+ "    ================================================== -->\r\n"
				+ "\r\n"
				+ "    <div class=\"callout\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "          <div class=\"col-xs-14\">\r\n"
				+ "            <h1><span style=\"color:#ea2a2e;\">Netflix</span> Open Source Software Center</h1>\r\n"
				+ "            <hr/>\r\n"
				+ "            <p><span style=\"color:#000000;\">\r\n"
				+ "              Netflix is committed to open source.  Netflix both leverages and provides open source technology focused on providing the leading Internet television\r\n"
				+ "              network.  Our technology focuses on providing immersive experiences across all internet-connected screens.  Netflix's deployment technology allows for continuous\r\n"
				+ "              build and integration into our worldwide deployments serving members in over 50 countries.  Our focus on reliability defined the\r\n"
				+ "              bar for cloud based elastic deployments with several layers of failover.  Netflix also provides the technology to operate services responsibly with operational\r\n"
				+ "              insight, peak performance, and security.  We provide technologies for data (persistent & semi-persistent) that serve the real-time load to our 62 million members,\r\n"
				+ "              as well as power the big data analytics that allow us to make informed decisions on how to improve our service.  If you want to learn more, jump\r\n"
				+ "              into any of the functional areas below to learn more.\r\n"
				+ "            </span></p>\r\n"
				+ "          </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "    <div class=\"container marketing\">\r\n"
				+ "\r\n"
				+ "     <!-- START THE FEATURETTES -->\r\n"
				+ "\r\n"
				+ "    <div class=\"col-sm-12\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/big-data.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"big-data\">Big Data</a></h2>\r\n"
				+ "          <h3>Tools and services to get the most out of your (big) data</h3>\r\n"
				+ "          <p class=\"lead\">Data is invaluable in making Netflix such an exceptional service for our customers. Behind the scenes, we have a\r\n"
				+ "            rich ecosystem of (big) data technologies facilitating our algorithms and analytics. We use and contribute to broadly-adopted open\r\n"
				+ "            source technologies including Hadoop, Hive, Pig, Parquet, Presto, and Spark. In addition, we’ve developed and contributed some additional\r\n"
				+ "            tools and services, which have further elevated our data platform. <a href=\"https://github.com/Netflix/genie\">Genie</a> is a powerful, REST-based abstraction to our various\r\n"
				+ "            data processing frameworks, notably Hadoop. <a href=\"https://github.com/Netflix/inviso\">Inviso</a> provides detailed insights into the performance of our Hadoop jobs and\r\n"
				+ "            clusters. <a href=\"https://github.com/Netflix/lipstick\">Lipstick</a> shows the workflow of Pig jobs in a clear, visual fashion. And\r\n"
				+ "            <a href=\"https://github.com/Netflix/aegisthus\">Aegisthus</a> enables the bulk abstraction of data out of Cassandra for downstream analytic processing.</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/build-delivery.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"build-and-delivery-tools\">Build and Delivery Tools</a></h2>\r\n"
				+ "          <h3>Taking code from desktop to the cloud</h3>\r\n"
				+ "          <p class=\"lead\">Netflix has open sourced many of our Gradle plugins under the name <a href=\"https://nebula-plugins.github.io/\">Nebula</a>. Nebula started off as\r\n"
				+ "            a set of strong opinions to make Gradle simple to use for our developers. But we quickly learned that we could use the same assumptions on our open source projects and\r\n"
				+ "            on other Gradle plugins to make them easy to build, test and deploy. By standardizing plugin development, we've lowered the barrier to generating\r\n"
				+ "            them, allowing us to keep our build modular and composable.</p>\r\n"
				+ "          <p class=\"lead\">We require additional tools to take these builds from the developers' desks to AWS. There are tens of thousands of instances\r\n"
				+ "            running Netflix. Every one of these runs on top of an image created by our open source tool <a href=\"https://github.com/Netflix/aminator\">Aminator</a>. Once packaged,\r\n"
				+ "            these AMIs are deployed to AWS using our Continuous Delivery Platform, <a href=\"http://spinnaker.io\">Spinnaker</a>. Spinnaker facilitates releasing software changes with high velocity and confidence.\r\n"
				+ "\r\n"
				+ "</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/cloud-platform.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"common-runtime\">Common Runtime Services & Libraries</a></h2>\r\n"
				+ "          <h3>Runtime containers, libraries and services that power microservices</h3>\r\n"
				+ "          <p class=\"lead\">The cloud platform is the foundation and technology stack for the majority of the services within Netflix. The cloud platform consists\r\n"
				+ "            of cloud services, application libraries and application containers. Specifically, the platform provides service discovery through\r\n"
				+ "            <a href=\"https://github.com/Netflix/eureka\">Eureka</a>, distributed configuration through <a href=\"https://github.com/Netflix/archaius\">Archaius</a>,\r\n"
				+ "            resilent and intelligent inter-process and service communication through <a href=\"https://github.com/Netflix/ribbon\">Ribbon</a>.  To provide reliability\r\n"
				+ "            beyond single service calls, <a href=\"https://github.com/Netflix/hystrix\">Hystrix</a> is provided to isolate latency and fault tolerance at runtime. The previous\r\n"
				+ "            libraries and services can be used with any JVM based container.</p>\r\n"
				+ "          <p class=\"lead\">The platform provides JVM container services through\r\n"
				+ "            <a href=\"https://github.com/Netflix/karyon\">Karyon</a> and <a href=\"https://github.com/Netflix/governator\">Governator</a> and support for non-JVM runtimes\r\n"
				+ "            via the <a href=\"https://github.com/Netflix/prana\">Prana</a> sidecar.  While Prana provides proxy capabilities within an instance,\r\n"
				+ "            <a href=\"https://github.com/Netflix/zuul\">Zuul</a> (which integrates Hystrix, Eureka, and Ribbon as part of its IPC capabilities) provides dyamically\r\n"
				+ "            scriptable proxying at the edge of the cloud deployment.</p>\r\n"
				+ "          <p class=\"lead\">The platform works well within the EC2 cloud utilizing the Amazon autoscaler.  For container applications and batch jobs running on Apache Mesos,\r\n"
				+ "            <a href=\"https://github.com/Netflix/Fenzo\">Fenzo</a> is a scheduler that provides advanced scheduling and resource management for cloud native frameworks.  Fenzo\r\n"
				+ "            provides plugin implementations for bin packing, cluster autoscaling, and custom scheduling optimizations can be implemented through user-defined plugins.</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/content-engineering.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"content-encoding\">Content Encoding</a></h2>\r\n"
				+ "          <h3>Automated Scalable Multimedia Ingest and Encoding</h3>\r\n"
				+ "          <p class=\"lead\">One of the great challenges for Netflix is managing the large and numerous audio and video assets at scale.  This scale challenge\r\n"
				+ "            is bounded by Hollywood master files that can be multiple terabytes in size, and cellular audio and video encodes which must provide an excellent\r\n"
				+ "            customer experience at 200 Kilobits-per-second.  As part of the Netflix Digital Supply Chain, our encoding-related open-source efforts focus on tools\r\n"
				+ "            and technologies that allow us meet the challenges of content ingest, and encoding, at scale.</p>\r\n"
				+ "          <p class=\"lead\"><a href=\"https://github.com/Netflix/photon\">Photon</a> is a Java implementation of the Interoperable Master Format (IMF) standard.\r\n"
				+ "            IMF is a SMPTE standard whose core constraints are defined in the specification st2067-2:2013. <a href=\"https://github.com/Netflix/vmaf\">VMAF</a> is\r\n"
				+ "            a perceptual quality metric that out-performs the many objective metrics that are currently used for video encoder quality tests.</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/data-persistence.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"data-persistence\">Data Persistence</a></h2>\r\n"
				+ "          <h3>Storing and Serving data in the Cloud.</h3>\r\n"
				+ "          <p class=\"lead\">Handling over a trillion data operations per day requires an interesting mix of “off the shelf OSS” and in house projects. No single data\r\n"
				+ "            technology can meet every use case or satisfy every latency requirement. Our needs range from non-durable in-memory stores like Memcached, Redis, and <a href=\"http://hollow.how\">Hollow</a>,\r\n"
				+ "            to searchable datastores such as Elastic and durable must-never-go-down datastores like Cassandra and MySQL.</p>\r\n"
				+ "          <p class=\"lead\">Our Cloud usage and the scale at which we consume these technologies, has required us to build tools and services that enhance the\r\n"
				+ "            datastores we use. We’ve created the sidecars <a href=\"https://github.com/Netflix/Raigad\">Raigad</a> and <a href=\"https://github.com/Netflix/Priam\">Priam</a> to help with the deployment, management and backup/recovery of our hundreds of Elastic and\r\n"
				+ "            Cassandra clusters. We’ve created <a href=\"https://github.com/Netflix/EVCache\">EVCache</a> and <a href=\"https://github.com/Netflix/dynomite\">Dynomite</a> to use\r\n"
				+ "            Memcached and Redis at scale. We’ve even developed the <a href=\"https://github.com/Netflix/dyno\">Dyno</a> client library to better consume Dynomite\r\n"
				+ "            in the Cloud.</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/insight-performance.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"insight-reliability-performance\">Insight, Reliability and Performance</a></h2>\r\n"
				+ "          <h3>Providing Actionable Insight at Massive Scale</h3>\r\n"
				+ "          <p class=\"lead\">Telemetry and metrics play a critical role in the operations of any company, and at more than a billion metrics per minute flowing into\r\n"
				+ "            <a href=\"https://github.com/Netflix/atlas\">Atlas</a>, our time-series telemetry platform, they play a critical role at Netflix.  However, Operational\r\n"
				+ "            Insight is considered a higher-order family of products at Netflix, including the ability to understand the current components of our cloud ecosystem\r\n"
				+ "            via <a href=\"https://github.com/Netflix/edda\">Edda</a>, and the easy integration of Java application code with Atlas via the\r\n"
				+ "            <a href=\"https://github.com/Netflix/spectator\">Spectator</a> library.</p>\r\n"
				+ "          <p class=\"lead\">Effective performance instrumentation allows engineers to drill quickly on a massive volume of metrics, making critical decisions quickly\r\n"
				+ "            and efficiently.  <a href=\"https://github.com/Netflix/vector\">Vector</a> exposes high-resolution host-level metrics with minimal overhead.\r\n"
				+ "          <p class=\"lead\">Being able to understand the current state of our complex microservice architecture at a glance is crucial when making remediation decisions.\r\n"
				+ "            <a href=\"https://github.com/Netflix/vizceral\">Vizceral</a> helps provide this at-a-glance intuition without needing to first build up a mental model of the system.</p>\r\n"
				+ "\r\n"
				+ "             <p class=\"lead\">Finally to validate reliability, we have <a href=\"https://github.com/Netflix/chaosmonkey\">Chaos Monkey</a> which tests our instances\r\n"
				+ "            for random failures, along with the <a href=\"https://github.com/Netflix/SimianArmy\">Simian Army</a>.</p>\r\n"
				+ "            </p>\r\n"
				+ "          </p>\r\n"
				+ "          </p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/security.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"security\">Security</a></h2>\r\n"
				+ "          <h3>Defending at Scale</h3>\r\n"
				+ "          <p class=\"lead\">Security is an increasingly important area for organizations of all types and sizes, and Netflix is happy to contribute a variety of\r\n"
				+ "            security tools and solutions to the open source community. Our security-related open source efforts focus primarily on operational tools and systems\r\n"
				+ "            to make security teams more efficient and effective when securing large and dynamic environments.</p>\r\n"
				+ "          <p class=\"lead\"><a href=\"https://github.com/Netflix/security_monkey\">Security Monkey</a> helps monitor and secure large AWS-based environments, allowing\r\n"
				+ "            security teams to identify potential security weaknesses. <a href=\"https://github.com/Netflix/scumblr\">Scumblr</a> is an intelligence gathering tool that\r\n"
				+ "            leverages Internet-wide targeted searches to surface specific security issues for investigation.\r\n"
				+ "	    <a href=\"https://github.com/Netflix/stethoscope\">Stethoscope</a> is a web application that collects information from existing systems management tools\r\n"
				+ "	    (e.g., JAMF or LANDESK) on a given employee’s devices and gives them clear and specific recommendations for securing their systems.</p>\r\n"
				+ "          </p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <hr class=\"featurette-divider\">\r\n"
				+ "\r\n"
				+ "      <div class=\"row featurette\">\r\n"
				+ "        <div class=\"col-sm-4\">\r\n"
				+ "          <img class=\"featurette-image img-responsive center-block\" src=\"images/front-icons/user-interface.png\" alt=\"Generic placeholder image 1\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-sm-8\">\r\n"
				+ "          <h2 class=\"featurette-heading\"><a class=\"nostyle\" name=\"user-interface\">User Interface</a></h2>\r\n"
				+ "          <h3>Libraries to help you build rich client applications</h3>\r\n"
				+ "          <p class=\"lead\">Every month, Netflix members around the world discover and watch more than ten billion hours of movies and shows on their TV, mobile\r\n"
				+ "            and desktop devices. Using modern UI technologies like Node.js, React and RxJS, our engineers build rich client applications that run across thousands\r\n"
				+ "            of devices. We strive to create cinematic, immersive experiences that delight our members, exhibit exceptional performance and work flawlessly. We're\r\n"
				+ "            continuously improving the product through data-driven A/B testing that enables us to experiment with novel concepts and understand the value of every\r\n"
				+ "            feature we ship.</p>\r\n"
				+ "          <p class=\"lead\">We created <a href=\"https://netflix.github.io/falcor\">Falcor</a> for efficient data fetching. We help maintain\r\n"
				+ "            <a href=\"https://github.com/restify/node-restify\">Restify</a> to enable us to scale Node.js applications with full observability. We're\r\n"
				+ "            helping to build the next version of <a href=\"https://github.com/ReactiveX/RxJS\">RxJS</a> to improve its performance and debuggability.</p>\r\n"
				+ "          </p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "    <!-- /END THE FEATURETTES -->\r\n"
				+ "\r\n"
				+ "     <!-- START SIDEBAR -->\r\n"
				+ "\r\n"
				+ "      <!--\r\n"
				+ "     <div class=\"col-sm-4 sidebar\">\r\n"
				+ "\r\n"
				+ "     <a class=\"twitter-timeline\" href=\"https://twitter.com/NetflixOSS\" data-theme=\"dark\" data-widget-id=\"586596093502205952\">Tweets by @NetflixOSS</a>\r\n"
				+ "     <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\r\n"
				+ "\r\n"
				+ "     <p class=\"sidebar-sub\"><strong>Open Source</strong></p>\r\n"
				+ "     <ul class=\"sidebar-list\">\r\n"
				+ "       <li><a href=\"http://netflix.github.io/\" target=\"_blank\">NETFLIX OPEN SOURCE</a></li>\r\n"
				+ "       <li><a href=\"http://netflix.github.io/\" target=\"_blank\">NETFLIX GITHUB</a></li>\r\n"
				+ "       <li><a href=\"https://jobs.netflix.com/\" target=\"_blank\">GET IN ON THE FUN: JOIN US!</a></li>\r\n"
				+ "     </ul>\r\n"
				+ "\r\n"
				+ "     <p class=\"sidebar-sub\"><strong>Stay in Touch</strong></p>\r\n"
				+ "     <ul>\r\n"
				+ "       <li><a href=\"http://techblog.netflix.com/\" target=\"_blank\">OUR TECH BLOG</a></li>\r\n"
				+ "       <li><a href=\"https://twitter.com/NetflixOSS\" target=\"_blank\">@NetflixOSS</a></li>\r\n"
				+ "       <li><a href=\"http://www.slideshare.net/netflix\" target=\"_blank\">SLIDESHARE</a></li>\r\n"
				+ "       <li><a href=\"http://www.meetup.com/Netflix-Open-Source-Platform/\" target=\"_blank\">NETFLIX MEETUP</a></li>\r\n"
				+ "     </ul>\r\n"
				+ "\r\n"
				+ "     </div>\r\n"
				+ "           -->\r\n"
				+ "\r\n"
				+ "     <!-- /END SIDEBAR -->\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </div><!-- /.container -->\r\n"
				+ "\r\n"
				+ "    <!-- FOOTER -->\r\n"
				+ "\r\n"
				+ "    <footer>\r\n"
				+ "      <div class=\"footer\">\r\n"
				+ "        <div class=\"container\">\r\n"
				+ "          <div class=\"col-md-4\">\r\n"
				+ "            <p class=\"footer-sub\"><strong>Open Source</strong></p>\r\n"
				+ "            <ul>\r\n"
				+ "              <li><a href=\"https://www.github.com/netflix\" target=\"_blank\">NETFLIX OPEN SOURCE</a></li>\r\n"
				+ "              <li><a href=\"https://jobs.netflix.com/\" target=\"_blank\">GET IN ON THE FUN: JOIN US!</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"col-md-4\">\r\n"
				+ "            <p class=\"footer-sub\"><strong>Stay in Touch</strong></p>\r\n"
				+ "            <ul>\r\n"
				+ "              <li><a href=\"http://techblog.netflix.com/\" target=\"_blank\">OUR TECH BLOG</a></li>\r\n"
				+ "              <li><a href=\"https://twitter.com/NetflixOSS\" target=\"_blank\">@NetflixOSS</a></li>\r\n"
				+ "              <li><a href=\"http://www.slideshare.net/netflix\" target=\"_blank\">SLIDESHARE</a></li>\r\n"
				+ "              <li><a href=\"http://www.meetup.com/Netflix-Open-Source-Platform/\" target=\"_blank\">NETFLIX MEETUP</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"powered-by-copyright col-md-4\">\r\n"
				+ "            <a href=\"/\"><img src=\"images/Netflix-OSS-Logo-Small.png\" /></a>\r\n"
				+ "            <p style=\"clear:both;\">&copy; 2012-2016 NETFLIX, INC. ALL RIGHTS RESERVED</p>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </footer>\r\n"
				+ "\r\n"
				+ "    <!-- Bootstrap core JavaScript\r\n"
				+ "    ================================================== -->\r\n"
				+ "    <!-- Placed at the end of the document so the pages load faster -->\r\n"
				+ "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n"
				+ "    <script src=\"js/bootstrap.min.js\"></script>\r\n"
				+ "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n"
				+ "    <script src=\"js/ie10-viewport-bug-workaround.js\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
