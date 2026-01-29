{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.FineTuningSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postFineTuningJobsByTextCancelR" $
        it "returns 501 Not Implemented" $ do
            post $ FineTuningJobsByTextCancelR "ft-AF1WoRqd3aJAHsqc9NY7iL8F"
            statusIs 501

    describe "postFineTuningJobsR" $
        it "returns 501 Not Implemented" $ do
            post FineTuningJobsR
            statusIs 501

    describe "getFineTuningJobsByTextEventsR" $
        it "returns 501 Not Implemented" $ do
            get $ FineTuningJobsByTextEventsR "ft-AF1WoRqd3aJAHsqc9NY7iL8F"
            statusIs 501

    describe "getFineTuningJobsByTextCheckpointsR" $
        it "returns 501 Not Implemented" $ do
            get $ FineTuningJobsByTextCheckpointsR "ft-AF1WoRqd3aJAHsqc9NY7iL8F"
            statusIs 501

    describe "getFineTuningJobsR" $
        it "returns 501 Not Implemented" $ do
            get FineTuningJobsR
            statusIs 501

    describe "getFineTuningJobsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ FineTuningJobsByTextR "ft-AF1WoRqd3aJAHsqc9NY7iL8F"
            statusIs 501
