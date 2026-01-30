{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BatchSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBatchesByTextCancelR" $
        it "returns 501 Not Implemented" $ do
            post $ BatchesByTextCancelR "batchId_example"
            statusIs 501

    describe "postBatchesR" $
        it "returns 501 Not Implemented" $ do
            post BatchesR
            statusIs 501

    describe "getBatchesR" $
        it "returns 501 Not Implemented" $ do
            get BatchesR
            statusIs 501

    describe "getBatchesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ BatchesByTextR "batchId_example"
            statusIs 501
