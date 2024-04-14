{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AssistantsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postThreadsByTextRunsByTextCancelR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextRunsByTextCancelR "threadId_example" "runId_example"
            statusIs 501

    describe "postAssistantsR" $
        it "returns 501 Not Implemented" $ do
            post AssistantsR
            statusIs 501

    describe "postAssistantsByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            post $ AssistantsByTextFilesR "file-abc123"
            statusIs 501

    describe "postThreadsByTextMessagesR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextMessagesR "threadId_example"
            statusIs 501

    describe "postThreadsByTextRunsR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextRunsR "threadId_example"
            statusIs 501

    describe "postThreadsR" $
        it "returns 501 Not Implemented" $ do
            post ThreadsR
            statusIs 501

    describe "postThreadsRunsR" $
        it "returns 501 Not Implemented" $ do
            post ThreadsRunsR
            statusIs 501

    describe "deleteAssistantsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AssistantsByTextR "assistantId_example"
            statusIs 501

    describe "deleteAssistantsByTextFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ AssistantsByTextFilesByTextR "assistantId_example" "fileId_example"
            statusIs 501

    describe "deleteThreadsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ ThreadsByTextR "threadId_example"
            statusIs 501

    describe "getAssistantsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AssistantsByTextR "assistantId_example"
            statusIs 501

    describe "getAssistantsByTextFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AssistantsByTextFilesByTextR "assistantId_example" "fileId_example"
            statusIs 501

    describe "getThreadsByTextMessagesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextMessagesByTextR "threadId_example" "messageId_example"
            statusIs 501

    describe "getThreadsByTextMessagesByTextFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextMessagesByTextFilesByTextR "thread_abc123" "msg_abc123" "file-abc123"
            statusIs 501

    describe "getThreadsByTextRunsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextRunsByTextR "threadId_example" "runId_example"
            statusIs 501

    describe "getThreadsByTextRunsByTextStepsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextRunsByTextStepsByTextR "threadId_example" "runId_example" "stepId_example"
            statusIs 501

    describe "getThreadsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextR "threadId_example"
            statusIs 501

    describe "getAssistantsByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            get $ AssistantsByTextFilesR "assistantId_example"
            statusIs 501

    describe "getAssistantsR" $
        it "returns 501 Not Implemented" $ do
            get AssistantsR
            statusIs 501

    describe "getThreadsByTextMessagesByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextMessagesByTextFilesR "threadId_example" "messageId_example"
            statusIs 501

    describe "getThreadsByTextMessagesR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextMessagesR "threadId_example"
            statusIs 501

    describe "getThreadsByTextRunsByTextStepsR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextRunsByTextStepsR "threadId_example" "runId_example"
            statusIs 501

    describe "getThreadsByTextRunsR" $
        it "returns 501 Not Implemented" $ do
            get $ ThreadsByTextRunsR "threadId_example"
            statusIs 501

    describe "postAssistantsByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ AssistantsByTextR "assistantId_example"
            statusIs 501

    describe "postThreadsByTextMessagesByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextMessagesByTextR "threadId_example" "messageId_example"
            statusIs 501

    describe "postThreadsByTextRunsByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextRunsByTextR "threadId_example" "runId_example"
            statusIs 501

    describe "postThreadsByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextR "threadId_example"
            statusIs 501

    describe "postThreadsByTextRunsByTextSubmitToolOutputsR" $
        it "returns 501 Not Implemented" $ do
            post $ ThreadsByTextRunsByTextSubmitToolOutputsR "threadId_example" "runId_example"
            statusIs 501
