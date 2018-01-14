FROM envoyproxy/envoy:latest

ENV SERVICE_CLUSTER_NAME=envoy

VOLUME /config

RUN apt-get update && apt-get -q install -y curl
ADD ./envoy.json /config/envoy.json

EXPOSE 15000 15001

CMD /usr/local/bin/envoy -c /config/envoy.json --service-cluster ${SERVICE_CLUSTER_NAME}
