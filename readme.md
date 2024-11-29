# Environment prepared

## Technology

Based Java 17+
Springboot3.4.0
Elasticsearch 8.16.1

## Docker

yum update
#如果你是第一次更新yum可能需要比较久的时间，遇到提示确认，按照提示输入y回车即可

curl -sSL https://get.docker.com/ | sh
#等待安装完成

#启动Docker
systemctl start docker

#查看Docker版本
docker version

--------不能下载镜像问题解决-----
https://www.cnblogs.com/geekbruce/articles/18570180

## ElasticSearch & Kibana

------------示例----------------------------
https://www.elastic.co/guide/en/kibana/current/docker.html

https://blog.csdn.net/Acloasia/article/details/130683934
-- 创建网络
docker network create elastic

docker pull elasticsearch:8.13.0

docker run -d 
--restart=always 
--name es 
--network elastic 
-p 9200:9200 
-p 9300:9300 
--privileged 
-v /usr/local/es/data:/usr/share/elasticsearch/data 
-v /usr/local/es/plugins:/usr/share/elasticsearch/plugins 
-e "discovery.type=single-node" 
-e "ES_JAVA_OPTS=-Xms512m -Xmx512m" 
elasticsearch:8.13.0

--重置密码
elasticsearch-reset-password -u elastic

-- 禁用密码
echo "xpack.security.enabled: false" >> elasticsearch.yml

--如果es开启了密码验证 -------kibana无法访问ES ：Kibana server is not ready yet.
docker pull kibana:8.13.0

docker run -d
--restart=always
--name kibana
--network elastic
-p 5601:5601
-e ELASTICSEARCH_HOSTS=http://192.168.158.10:9200
kibana:8.13.0

# Reference

https://cloud.tencent.com/developer/article/1436465
