{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.FilesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postFilesR" $
        it "returns 501 Not Implemented" $ do
            post FilesR
            statusIs 501

    describe "deleteFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ FilesByTextR "fileId_example"
            statusIs 501

    describe "getFilesByTextContentR" $
        it "returns 501 Not Implemented" $ do
            get $ FilesByTextContentR "fileId_example"
            statusIs 501

    describe "getFilesR" $
        it "returns 501 Not Implemented" $ do
            get FilesR
            statusIs 501

    describe "getFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ FilesByTextR "fileId_example"
            statusIs 501
