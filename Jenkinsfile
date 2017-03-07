#!groovy

stage 'Dev'
node  {
    checkout scm
    echo 'Dev'
    
}

stage 'QA'
parallel(longerTests: {
    echo 'tests1 '
}, quickerTests: {
    echo 'tests2 '
})

stage name: 'Staging', concurrency: 1
node  {
    echo 'Staging'
}

input message: "Does staging look good?"
try {
    checkpoint('Before production')
} catch (NoSuchMethodError _) {
    echo 'Checkpoint feature available in CloudBees Jenkins Enterprise.'
}

stage name: 'Production', concurrency: 1
node {
    echo 'Production server looks to be alive'
    echo "Deployed to production"
}
