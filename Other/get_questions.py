from lxml import html
import requests
import sys

chapter = str(sys.argv[1])
clen = int(sys.argv[2])
ans = int(sys.argv[3])
page = 1;

while True:
	url = "http://chortle.ccsu.edu/java5/Notes/chap" + chapter + "/ch" + chapter[0:clen] + "_" + str(page) + ".html"
	site = requests.get(url)
	if site.status_code != 200:
		break
	tree = html.fromstring(site.content)

	if(ans != 0 and page > 1):
		s = ""
		answer = tree.xpath('/html/body/div[1]//text()')
		for i in answer:
			s += i
		s = " ".join(s.split())
		print(s)
		print('\n')

	s = ""
	question = tree.xpath('/html/body/div[3]//text()')
	for i in question:
		s += i
	s = " ".join(s.split())
	if(s != "You have reached the end of the chapter."):
		print(s)

	page += 1