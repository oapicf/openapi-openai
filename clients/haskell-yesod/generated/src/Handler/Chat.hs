{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Chat where

import           Import


-- | Creates a model response for the given chat conversation.
--
-- operationId: createChatCompletion
postChatCompletionsR :: Handler Value
postChatCompletionsR = notImplemented
