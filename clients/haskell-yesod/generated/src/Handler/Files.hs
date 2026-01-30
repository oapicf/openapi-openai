{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Files where

import           Import


-- | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
--
-- operationId: createFile
postFilesR :: Handler Value
postFilesR = notImplemented

-- | Delete a file.
--
-- operationId: deleteFile
deleteFilesByTextR :: Text -- ^ The ID of the file to use for this request.
                   -> Handler Value
deleteFilesByTextR fileId = notImplemented

-- | Returns the contents of the specified file.
--
-- operationId: downloadFile
getFilesByTextContentR :: Text -- ^ The ID of the file to use for this request.
                       -> Handler Value
getFilesByTextContentR fileId = notImplemented

-- | Returns a list of files.
--
-- operationId: listFiles
getFilesR :: Handler Value
getFilesR = notImplemented

-- | Returns information about a specific file.
--
-- operationId: retrieveFile
getFilesByTextR :: Text -- ^ The ID of the file to use for this request.
                -> Handler Value
getFilesByTextR fileId = notImplemented
