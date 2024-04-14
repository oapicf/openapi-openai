{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Embeddings where

import           Import


-- | Creates an embedding vector representing the input text.
--
-- operationId: createEmbedding
postEmbeddingsR :: Handler Value
postEmbeddingsR = notImplemented
