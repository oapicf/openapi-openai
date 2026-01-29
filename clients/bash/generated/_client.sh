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
            "createAssistantFile[Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).]" \
            "createMessage[Create a message.]" \
            "createRun[Create a run.]" \
            "createThread[Create a thread.]" \
            "createThreadAndRun[Create a thread and run it in one request.]" \
            "deleteAssistant[Delete an assistant.]" \
            "deleteAssistantFile[Delete an assistant file.]" \
            "deleteThread[Delete a thread.]" \
            "getAssistant[Retrieves an assistant.]" \
            "getAssistantFile[Retrieves an AssistantFile.]" \
            "getMessage[Retrieve a message.]" \
            "getMessageFile[Retrieves a message file.]" \
            "getRun[Retrieves a run.]" \
            "getRunStep[Retrieves a run step.]" \
            "getThread[Retrieves a thread.]" \
            "listAssistantFiles[Returns a list of assistant files.]" \
            "listAssistants[Returns a list of assistants.]" \
            "listMessageFiles[Returns a list of message files.]" \
            "listMessages[Returns a list of messages for a given thread.]" \
            "listRunSteps[Returns a list of run steps belonging to a run.]" \
            "listRuns[Returns a list of runs belonging to a thread.]" \
            "modifyAssistant[Modifies an assistant.]" \
            "modifyMessage[Modifies a message.]" \
            "modifyRun[Modifies a run.]" \
            "modifyThread[Modifies a thread.]" \
            "submitToolOuputsToRun[When a run has the 'status: \"requires_action\"' and 'required_action.type' is 'submit_tool_outputs', this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.]"             "createSpeech[Generates audio from the input text.]" \
            "createTranscription[Transcribes audio into the input language.]" \
            "createTranslation[Translates audio into English.]"             "createChatCompletion[Creates a model response for the given chat conversation.]"             "createCompletion[Creates a completion for the provided prompt and parameters.]"             "createEmbedding[Creates an embedding vector representing the input text.]"             "createFile[Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports '.jsonl' files.

Please [contact us](https://help.openai.com/) if you need to increase these storage limits.]" \
            "deleteFile[Delete a file.]" \
            "downloadFile[Returns the contents of the specified file.]" \
            "listFiles[Returns a list of files that belong to the user's organization.]" \
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
            "createImageVariation[Creates a variation of a given image.]"             "deleteModel[Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.]" \
            "listModels[Lists the currently available models, and provides basic information about each one such as the owner and availability.]" \
            "retrieveModel[Retrieves a model instance, providing basic information about the model such as the owner and permissioning.]"             "createModeration[Classifies if text is potentially harmful.]" \

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
      createAssistantFile)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant for which to create a File."
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
      deleteAssistantFile)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant that the file belongs to."
"file_id=:[PATH] The ID of the file to delete."
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
      getAssistantFile)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant who the file belongs to."
"file_id=:[PATH] The ID of the file we&#39;re getting."
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
      getMessageFile)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread to which the message and File belong."
"message_id=:[PATH] The ID of the message the file belongs to."
"file_id=:[PATH] The ID of the file being retrieved."
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
      listAssistantFiles)
        local -a _op_arguments
        _op_arguments=(
          "assistant_id=:[PATH] The ID of the assistant the file belongs to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listAssistants)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listMessageFiles)
        local -a _op_arguments
        _op_arguments=(
          "thread_id=:[PATH] The ID of the thread that the message and files belong to."
"message_id=:[PATH] The ID of the message that the files belongs to."
          "limit=:[QUERY] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20."
"order=:[QUERY] Sort order by the &#39;created_at&#39; timestamp of the objects. &#39;asc&#39; for ascending order and &#39;desc&#39; for descending order."
"after=:[QUERY] A cursor for use in pagination. &#39;after&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list."
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
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
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
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
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
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
"before=:[QUERY] A cursor for use in pagination. &#39;before&#39; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list."
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
    esac
    ;;

esac

return ret
