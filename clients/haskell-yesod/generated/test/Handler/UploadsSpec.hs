{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UploadsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postUploadsByTextPartsR" $
        it "returns 501 Not Implemented" $ do
            post $ UploadsByTextPartsR "upload_abc123"
            statusIs 501

    describe "postUploadsByTextCancelR" $
        it "returns 501 Not Implemented" $ do
            post $ UploadsByTextCancelR "upload_abc123"
            statusIs 501

    describe "postUploadsByTextCompleteR" $
        it "returns 501 Not Implemented" $ do
            post $ UploadsByTextCompleteR "upload_abc123"
            statusIs 501

    describe "postUploadsR" $
        it "returns 501 Not Implemented" $ do
            post UploadsR
            statusIs 501
