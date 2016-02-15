# elasticsearch-plugin-sample
Elasticsearch 1.x plugin example

## Create package
```
$ mvn package
```

## Install plugin
```
$ cd /usr/share/elasticsearch/
$ sudo ./bin/plugin --url file:///${your_plugin_path}/elasticsearch-sample-1.7.5-SNAPSHOT.jar -i elasticsearch-sample
$ sudo service elasticsearch restart
```