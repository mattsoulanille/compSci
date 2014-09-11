import sys
import argparse
import time
import os
class createJava(object):
    def __init__(self):

        self.date = time.strftime("%Y-%m-%d")
    def makeFileAndDirectories(self, path, name):
        cwd = os.getcwd() + '/'
        self.jFile = open(cwd + path + name + '.java', 'w+')
        self.contents = ['/**', '  * ' + name +'.java' + ' program', '  * @author Matthew Soulanille', '  * @version ' + self.date, '*/' ]
        for x in self.contents:
            self.jFile.write(x + '\n')
        

def main(argv):

    parser = argparse.ArgumentParser(description='Initiate a new java compSci program')
    parser.add_argument('name', type=str, help='Name of program (no .java at end)')
    parser.add_argument('path', type=str, default='', nargs='?', help='Path in which to place the program')


    args = parser.parse_args()
    
    newJ = createJava()
    newJ.makeFileAndDirectories(args.path, args.name)

if __name__ == '__main__':
    main(sys.argv)
