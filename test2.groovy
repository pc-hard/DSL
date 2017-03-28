pylint $WORKSPACE/hello.py || exit 0
 archiveArtifacts artifacts:  '*.py'
