#/usr/bin/evn bash

lein new dropship testproj --to-dir /tmp/testproj

cd /tmp/testproj && lein midje

