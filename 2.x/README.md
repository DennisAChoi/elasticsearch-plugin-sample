# elasticsearch-plugin-sample
Elasticsearch 2.x plugin example

## Create package
```
$ gradle build buildPluginZip
```

## Install plugin
```
$ cd /usr/share/elasticsearch/
$ sudo ./bin/plugin install file:///[YOUR_PLUGIN_PATH]/elasticsearch-sample-1.0-plugin.zip
$ sudo service elasticsearch restart
```
