#include <iostream>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <cstdlib>
using namespace std;

void sig_chld(int signo) {
    pid_t pid;
    int stat;
    pid = wait(&stat);    
    cout << "child " << pid << " exit\n";
    return;
}


int main() {
	pid_t child = fork();
	if( child == -1 ) { //error
		cout << "\nfork child error.";
		exit(0);
	} else if(child == 0){
		cout << "\nIm in child process:" <<  getpid() << endl;
		exit(0);
	} else {
		cout << "\nIm in parent process."  << endl;
//		sleep(600);
		signal(SIGCHLD,  &sig_chld);
	}
	return 0;
}
