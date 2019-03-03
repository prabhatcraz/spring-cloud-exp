#!/usr/bin/env bash
docker build  -t springio/beers .
docker run -p 8005:8000 springio/beers
