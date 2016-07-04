FROM centos

RUN yum update -y \
	&& yum install -y \
		java-1.8.0-openjdk-devel \
		graphviz \
	&& yum clean all 
		

COPY x86_64 /opt/nasdanika-bank

RUN chmod a+x /opt/nasdanika-bank/eclipse	

ENTRYPOINT ["/opt/nasdanika-bank/eclipse"]

EXPOSE 8080