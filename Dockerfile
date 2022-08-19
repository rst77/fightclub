FROM frolvlad/alpine-glibc:alpine-3.14
COPY fightclub-0.1-compacted /opt/docker/fightclub-0.1-compacted
CMD ["/opt/docker/fightclub-0.1-compacted"]
EXPOSE 8080
