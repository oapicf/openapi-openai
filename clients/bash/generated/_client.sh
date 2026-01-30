#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# ! Generator version: 7.18.0
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "cancelRun[Cancels a run that is 'in_progress'.]" \
            "createAssistant[Create an assistant with a model and instructions.]" \
            "createMessage[Create a message.]" \
            "createRun[Create a run.]" \
            "createThread[Create a thread.]" \
            "createThreadAndRun[Create a thread and run it in one request.]" \
            "deleteAssistant[Delete an assistant.]" \
            "deleteMessage[Deletes a message.]" \
            "deleteThread[Delete a thread.]" \
            "getAssistant[Retrieves an assistant.]" \
            "getMessage[Retrieve a message.]" \
            "getRun[Retrieves a run.]" \
            "getRunStep[Retrieves a run step.]" \
            "getThread[Retrieves a thread.]" \
            "listAssistants[Returns a list of assistants.]" \
            "listMessages[Returns a list of messages for a given thread.]" \
            "listRunSteps[Returns a list of run steps belonging to a run.]" \
            "listRuns[Returns a list of runs belonging to a thread.]" \
            "modifyAssistant[Modifies an assistant.]" \
            "modifyMessage[Modifies a message.]" \
            "modifyRun[Modifies a run.]" \
            "modifyThread[Modifies a thread.]" \
            "submitToolOuputsToRun[When a run has the 'status: \"requires_action\"' and 'required_action.type' is 'submit_tool_outputs', this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.]"             "createSpeech[Generates audio from the input text.]" \
            "createTranscription[Transcribes audio into the input language.]" \
            "createTranslation[Translates audio into English.]"             "listAuditLogs[List user actions and configuration changes within this organization.]"             "cancelBatch[Cancels an in-progress batch. The batch will be in status 'cancelling' for up to 10 minutes, before changing to 'cancelled', where it will have partial results (if any) available in the output file.]" \
            "createBatch[Creates and executes a batch from an uploaded file of requests]" \
            "listBatches[List your organization's batches.]" \
            "retrieveBatch[Retrieves a batch.]"             "createChatCompletion[Creates a model response for the given chat conversation. Learn more in the
[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),
and [audio](/docs/guides/audio) guides.

Parameter support can differ depending on the model used to generate the
response, particularly for newer reasoning models. Parameters that are only
supported for reasoning models are noted below. For the current state of 
unsupported parameters in reasoning models, 
[refer to the reasoning guide](/docs/guides/reasoning).]"             "createCompletion[Creates a completion for the provided prompt and parameters.]"             "adminApiKeysCreate[Create an organization admin API key]" \
            "adminApiKeysDelete[Delete an organization admin API key]" \
            "adminApiKeysGet[Retrieve a single organization API key]" \
            "adminApiKeysList[List organization API keys]"             "createEmbedding[Creates an embedding vector representing the input text.]"             "createFile[Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.

The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.

The Fine-tuning API only supports '.jsonl' files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.

The Batch API only supports '.jsonl' files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).

Please [contact us](https://help.openai.com/) if you need to increase these storage limits.]" \
            "deleteFile[Delete a file.]" \
            "downloadFile[Returns the contents of the specified file.]" \
            "listFiles[Returns a list of files.]" \
            "retrieveFile[Returns information about a specific file.]"             "cancelFineTuningJob[Immediately cancel a fine-tune job.]" \
            "createFineTuningJob[Creates a fine-tuning job which begins the process of creating a new model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about fine-tuning](/docs/guides/fine-tuning)]" \
            "listFineTuningEvents[Get status updates for a fine-tuning job.]" \
            "listFineTuningJobCheckpoints[List checkpoints for a fine-tuning job.]" \
            "listPaginatedFineTuningJobs[List your organization's fine-tuning jobs]" \
            "retrieveFineTuningJob[Get info about a fine-tuning job.

[Learn more about fine-tuning](/docs/guides/fine-tuning)]"             "createImage[Creates an image given a prompt.]" \
            "createImageEdit[Creates an edited or extended image given an original image and a prompt.]" \
            "createImageVariation[Creates a variation of a given image.]"             "deleteInvite[Delete an invite. If the invite has already been accepted, it cannot be deleted.]" \
            "inviteUser[Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.]" \
            "listInvites[Returns a list of invites in the organization.]" \
            "retrieveInvite[Retrieves an invite.]"             "deleteModel[Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.]" \
            "listModels[Lists the currently available models, and provides basic information about each one such as the owner and availability.]" \
            "retrieveModel[Retrieves a model instance, providing basic information about the model such as the owner and permissioning.]"             "createModeration[Classifies if text and/or image inputs are potentially harmful. Learn
more in the [moderation guide](/docs/guides/moderation).]"             "archiveProject[Archives a project in the organization. Archived projects cannot be used or updated.]" \
            "createProject[Create a new project in the organization. Projects can be created and archived, but cannot be deleted.]" \
            "createProjectServiceAccount[Creates a new service account in the project. This also returns an unredacted API key for the service account.]" \
            "createProjectUser[Adds a user to the project. Users must already be members of the organization to be added to a project.]" \
            "deleteProjectApiKey[Deletes an API key from the project.]" \
            "deleteProjectServiceAccount[Deletes a service account from the project.]" \
            "deleteProjectUser[Deletes a user from the project.]" \
            "listProjectApiKeys[Returns a list of API keys in the project.]" \
            "listProjectRateLimits[Returns the rate limits per model for a project.]" \
            "listProjectServiceAccounts[Returns a list of service accounts in the project.]" \
            "listProjectUsers[Returns a list of users in the project.]" \
            "listProjects[Returns a list of projects.]" \
            "modifyProject[Modifies a project in the organization.]" \
            "modifyProjectUser[Modifies a user's role in the project.]" \
            "retrieveProject[Retrieves a project.]" \
            "retrieveProjectApiKey[Retrieves an API key in the project.]" \
            "retrieveProjectServiceAccount[Retrieves a service account in the project.]" \
            "retrieveProjectUser[Retrieves a user in the project.]" \
            "updateProjectRateLimits[Updates a project rate limit.]"             "createRealtimeSession[Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
'session.update' client event.

It responds with a session object, plus a 'client_secret' key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API.]"             "addUploadPart[Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. 

Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.

It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).]" \
            "cancelUpload[Cancels the Upload. No Parts may be added after an Upload is cancelled.]" \
            "completeUpload[Completes the [Upload](/docs/api-reference/uploads/object). 

Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.

You can specify the order of the Parts by passing in an ordered list of the Part IDs.

The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.]" \
            "createUpload[Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.

Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.

For certain 'purpose's, the correct 'mime_type' must be specified. Please refer to documentation for the supported MIME types for your use case:
- [Assistants](/docs/assistants/tools/file-search#supported-files)

For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).]"             "usageAudioSpeeches[Get audio speeches usage details for the organization.]" \
            "usageAudioTranscriptions[Get audio transcriptions usage details for the organization.]" \
            "usageCodeInterpreterSessions[Get code interpreter sessions usage details for the organization.]" \
            "usageCompletions[Get completions usage details for the organization.]" \
            "usageCosts[Get costs details for the organization.]" \
            "usageEmbeddings[Get embeddings usage details for the organization.]" \
            "usageImages[Get images usage details for the organization.]" \
            "usageModerations[Get moderations usage details for the organization.]" \
            "usageVectorStores[Get vector stores usage details for the organization.]"             "deleteUser[Deletes a user from the organization.]" \
            "listUsers[Lists all of the users in the organization.]" \
            "modifyUser[Modifies a user's role in the organization.]" \
            "retrieveUser[Retrieves a user by their identifier.]"             "cancelVectorStoreFileBatch[Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.]" \
            "createVectorStore[Create a vector store.]" \
            "createVectorStoreFile[Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).]" \
            "createVectorStoreFileBatch[Create a vector store file batch.]" \
            "deleteVectorStore[Delete a vector store.]" \
            "deleteVectorStoreFile[Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.]" \
            "getVectorStore[Retrieves a vector store.]" \
            "getVectorStoreFile[Retrieves a vector store file.]" \
            "getVectorStoreFileBatch[Retrieves a vector store file batch.]" \
            "listFilesInVectorStoreBatch[Returns a list of vector store files in a batch.]" \
            "listVectorStoreFiles[Returns a list of vector store files.]" \
            "listVectorStores[Returns a list of vector stores.]" \
            "modifyVectorStore[Modifies a vector store.]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      cancelRun)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to which this run belongs."
"run_id=:[PATH] The ID of the run to cancel."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createAssistant)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createMessage)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) to create a message for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createRun)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to run."
          "include[]=:[QUERY] A list of additional fields to include in the response. Currently the only supported value is &#39;step_details.tool_calls[*].file_search.results[*].content&#39; to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createThread)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createThreadAndRun)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteAssistant)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteMessage)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to which this message belongs."
"message_id=:[PATH] The ID of the message to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteThread)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAssistant)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getMessage)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) to which this message belongs."
"message_id=:[PATH] The ID of the message to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getRun)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) that was run."
"run_id=:[PATH] The ID of the run to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getRunStep)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to which the run and run step belongs."
"run_id=:[PATH] The ID of the run to which the run step belongs."
"step_id=:[PATH] The ID of the run step to retrieve."
          "include[]=:[QUERY] A list of additional fields to include in the response. Currently the only supported value is &#39;step_details.tool_calls[*].file_search.results[*].content&#39; to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getThread)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listAssistants)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listMessages)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) the messages belong to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
"run_id=:[QUERY] Filter messages by the run ID that generated them."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listRunSteps)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread the run and run steps belong to."
"run_id=:[PATH] The ID of the run the run steps belong to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
"include[]=:[QUERY] A list of additional fields to include in the response. Currently the only supported value is &#39;step_details.tool_calls[*].file_search.results[*].content&#39; to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listRuns)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread the run belongs to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyAssistant)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant to modify."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyMessage)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to which this message belongs."
"message_id=:[PATH] The ID of the message to modify."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyRun)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) that was run."
"run_id=:[PATH] The ID of the run to modify."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyThread)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to modify. Only the &#39;metadata&#39; can be modified."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitToolOuputsToRun)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the [thread](/docs/api-reference/threads) to which this run belongs."
"run_id=:[PATH] The ID of the run that requires the tool output submission."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createSpeech)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createTranscription)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createTranslation)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listAuditLogs)
        local -a _op_arguments
        _op_arguments=(
                    "effective_at=:[QUERY] Return only events whose &#39;effective_at&#39; (Unix seconds) is in this range."
"project_ids[]=:[QUERY] Return only events for these projects."
"event_types[]=:[QUERY] Return only events with a &#39;type&#39; in one of these values. For example, &#39;project.created&#39;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object)."
"actor_ids[]=:[QUERY] Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID."
"actor_emails[]=:[QUERY] Return only events performed by users with these emails."
"resource_ids[]=:[QUERY] Return only events performed on these targets. For example, a project ID updated."
"limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      cancelBatch)
        local -a _op_arguments
        _op_arguments=(
          "batch_id=:[PATH] The ID of the batch to cancel."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createBatch)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listBatches)
        local -a _op_arguments
        _op_arguments=(
                    "after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveBatch)
        local -a _op_arguments
        _op_arguments=(
          "batch_id=:[PATH] The ID of the batch to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createChatCompletion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createCompletion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adminApiKeysCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adminApiKeysDelete)
        local -a _op_arguments
        _op_arguments=(
          "key_id=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adminApiKeysGet)
        local -a _op_arguments
        _op_arguments=(
          "key_id=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adminApiKeysList)
        local -a _op_arguments
        _op_arguments=(
                    "after=:[QUERY] "
"order=:[QUERY] "
"limit=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createEmbedding)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createFile)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteFile)
        local -a _op_arguments
        _op_arguments=(
          "file_id=:[PATH] The ID of the file to use for this request."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      downloadFile)
        local -a _op_arguments
        _op_arguments=(
          "file_id=:[PATH] The ID of the file to use for this request."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listFiles)
        local -a _op_arguments
        _op_arguments=(
                    "purpose=:[QUERY] Only return files with the given purpose."
"limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveFile)
        local -a _op_arguments
        _op_arguments=(
          "file_id=:[PATH] The ID of the file to use for this request."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      cancelFineTuningJob)
        local -a _op_arguments
        _op_arguments=(
          "fine_tuning_job_id=:[PATH] The ID of the fine-tuning job to cancel."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createFineTuningJob)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listFineTuningEvents)
        local -a _op_arguments
        _op_arguments=(
          "fine_tuning_job_id=:[PATH] The ID of the fine-tuning job to get events for."
          "after=:[QUERY] Identifier for the last event from the previous pagination request."
"limit=:[QUERY] Number of events to retrieve."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listFineTuningJobCheckpoints)
        local -a _op_arguments
        _op_arguments=(
          "fine_tuning_job_id=:[PATH] The ID of the fine-tuning job to get checkpoints for."
          "after=:[QUERY] Identifier for the last checkpoint ID from the previous pagination request."
"limit=:[QUERY] Number of checkpoints to retrieve."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listPaginatedFineTuningJobs)
        local -a _op_arguments
        _op_arguments=(
                    "after=:[QUERY] Identifier for the last job from the previous pagination request."
"limit=:[QUERY] Number of fine-tuning jobs to retrieve."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveFineTuningJob)
        local -a _op_arguments
        _op_arguments=(
          "fine_tuning_job_id=:[PATH] The ID of the fine-tuning job."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createImage)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createImageEdit)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createImageVariation)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteInvite)
        local -a _op_arguments
        _op_arguments=(
          "invite_id=:[PATH] The ID of the invite to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      inviteUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listInvites)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveInvite)
        local -a _op_arguments
        _op_arguments=(
          "invite_id=:[PATH] The ID of the invite to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteModel)
        local -a _op_arguments
        _op_arguments=(
          "model=:[PATH] The model to delete"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listModels)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveModel)
        local -a _op_arguments
        _op_arguments=(
          "model=:[PATH] The ID of the model to use for this request"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createModeration)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      archiveProject)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createProject)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createProjectServiceAccount)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createProjectUser)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteProjectApiKey)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"key_id=:[PATH] The ID of the API key."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteProjectServiceAccount)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"service_account_id=:[PATH] The ID of the service account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteProjectUser)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listProjectApiKeys)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listProjectRateLimits)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
          "limit=:[QUERY] A limit on the number of objects to be returned. The default is 100."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listProjectServiceAccounts)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listProjectUsers)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listProjects)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"include_archived=true:[QUERY] If &#39;true&#39; returns all projects including those that have been &#39;archived&#39;. Archived projects are not included by default."
          "include_archived=false:[QUERY] If &#39;true&#39; returns all projects including those that have been &#39;archived&#39;. Archived projects are not included by default."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyProject)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyProjectUser)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveProject)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveProjectApiKey)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"key_id=:[PATH] The ID of the API key."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveProjectServiceAccount)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"service_account_id=:[PATH] The ID of the service account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveProjectUser)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateProjectRateLimits)
        local -a _op_arguments
        _op_arguments=(
          "project_id=:[PATH] The ID of the project."
"rate_limit_id=:[PATH] The ID of the rate limit."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createRealtimeSession)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addUploadPart)
        local -a _op_arguments
        _op_arguments=(
          "upload_id=:[PATH] The ID of the Upload."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      cancelUpload)
        local -a _op_arguments
        _op_arguments=(
          "upload_id=:[PATH] The ID of the Upload."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      completeUpload)
        local -a _op_arguments
        _op_arguments=(
          "upload_id=:[PATH] The ID of the Upload."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createUpload)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageAudioSpeeches)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageAudioTranscriptions)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageCodeInterpreterSessions)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageCompletions)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"batch=true:[QUERY] If &#39;true&#39;, return batch jobs only. If &#39;false&#39;, return non-batch jobs only. By default, return both."
          "batch=false:[QUERY] If &#39;true&#39;, return batch jobs only. If &#39;false&#39;, return non-batch jobs only. By default, return both."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39;, &#39;batch&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageCosts)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently only &#39;1d&#39; is supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only costs for these projects."
"group_by=:[QUERY] Group the costs by the specified fields. Support fields include &#39;project_id&#39;, &#39;line_item&#39; and any combination of them."
"limit=:[QUERY] A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7."
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageEmbeddings)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageImages)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"sources=:[QUERY] Return only usages for these sources. Possible values are &#39;image.generation&#39;, &#39;image.edit&#39;, &#39;image.variation&#39; or any combination of them."
"sizes=:[QUERY] Return only usages for these image sizes. Possible values are &#39;256x256&#39;, &#39;512x512&#39;, &#39;1024x1024&#39;, &#39;1792x1792&#39;, &#39;1024x1792&#39; or any combination of them."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39;, &#39;size&#39;, &#39;source&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageModerations)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"user_ids=:[QUERY] Return only usage for these users."
"api_key_ids=:[QUERY] Return only usage for these API keys."
"models=:[QUERY] Return only usage for these models."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;, &#39;user_id&#39;, &#39;api_key_id&#39;, &#39;model&#39; or any combination of them."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      usageVectorStores)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Start time (Unix seconds) of the query time range, inclusive."
"end_time=:[QUERY] End time (Unix seconds) of the query time range, exclusive."
"bucket_width=:[QUERY] Width of each time bucket in response. Currently &#39;1m&#39;, &#39;1h&#39; and &#39;1d&#39; are supported, default to &#39;1d&#39;."
"project_ids=:[QUERY] Return only usage for these projects."
"group_by=:[QUERY] Group the usage data by the specified fields. Support fields include &#39;project_id&#39;."
"limit=:[QUERY] Specifies the number of buckets to return.
- &#39;bucket_width&#x3D;1d&#39;: default: 7, max: 31
- &#39;bucket_width&#x3D;1h&#39;: default: 24, max: 168
- &#39;bucket_width&#x3D;1m&#39;: default: 60, max: 1440"
"page=:[QUERY] A cursor for use in pagination. Corresponding to the &#39;next_page&#39; field from the previous response."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listUsers)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The ID of the user."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      cancelVectorStoreFileBatch)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the file batch belongs to."
"batch_id=:[PATH] The ID of the file batch to cancel."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createVectorStore)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createVectorStoreFile)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store for which to create a File."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createVectorStoreFileBatch)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store for which to create a File Batch."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteVectorStore)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteVectorStoreFile)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the file belongs to."
"file_id=:[PATH] The ID of the file to delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVectorStore)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store to retrieve."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVectorStoreFile)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the file belongs to."
"file_id=:[PATH] The ID of the file being retrieved."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVectorStoreFileBatch)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the file batch belongs to."
"batch_id=:[PATH] The ID of the file batch being retrieved."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listFilesInVectorStoreBatch)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the files belong to."
"batch_id=:[PATH] The ID of the file batch that the files belong to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
"filter=:[QUERY] Filter by file status. One of &#39;in_progress&#39;, &#39;completed&#39;, &#39;failed&#39;, &#39;cancelled&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listVectorStoreFiles)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store that the files belong to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
"filter=:[QUERY] Filter by file status. One of &#39;in_progress&#39;, &#39;completed&#39;, &#39;failed&#39;, &#39;cancelled&#39;."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listVectorStores)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      modifyVectorStore)
        local -a _op_arguments
        _op_arguments=(
          "vector_store_id=:[PATH] The ID of the vector store to modify."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
