#' Create a new CreateCompletionRequest
#'
#' @description
#' CreateCompletionRequest Class
#'
#' @docType class
#' @title CreateCompletionRequest
#' @description CreateCompletionRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateCompletionRequestModel}
#' @field prompt  \link{CreateCompletionRequestPrompt}
#' @field best_of Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. integer [optional]
#' @field echo Echo back the prompt in addition to the completion character [optional]
#' @field frequency_penalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) numeric [optional]
#' @field logit_bias Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. named list(integer) [optional]
#' @field logprobs Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. integer [optional]
#' @field max_tokens The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. integer [optional]
#' @field n How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. integer [optional]
#' @field presence_penalty Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) numeric [optional]
#' @field seed If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. integer [optional]
#' @field stop  \link{CreateCompletionRequestStop} [optional]
#' @field stream Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). character [optional]
#' @field suffix The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. character [optional]
#' @field temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. numeric [optional]
#' @field top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or `temperature` but not both. numeric [optional]
#' @field user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateCompletionRequest <- R6::R6Class(
  "CreateCompletionRequest",
  public = list(
    `model` = NULL,
    `prompt` = NULL,
    `best_of` = NULL,
    `echo` = NULL,
    `frequency_penalty` = NULL,
    `logit_bias` = NULL,
    `logprobs` = NULL,
    `max_tokens` = NULL,
    `n` = NULL,
    `presence_penalty` = NULL,
    `seed` = NULL,
    `stop` = NULL,
    `stream` = NULL,
    `suffix` = NULL,
    `temperature` = NULL,
    `top_p` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new CreateCompletionRequest class.
    #'
    #' @param model model
    #' @param prompt prompt
    #' @param best_of Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.. Default to 1.
    #' @param echo Echo back the prompt in addition to the completion. Default to FALSE.
    #' @param frequency_penalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details). Default to 0.
    #' @param logit_bias Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated.
    #' @param logprobs Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5.
    #' @param max_tokens The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.. Default to 16.
    #' @param n How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.. Default to 1.
    #' @param presence_penalty Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details). Default to 0.
    #' @param seed If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.
    #' @param stop stop
    #' @param stream Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).. Default to FALSE.
    #' @param suffix The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`.
    #' @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.. Default to 1.
    #' @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or `temperature` but not both.. Default to 1.
    #' @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
    #' @param ... Other optional arguments.
    initialize = function(`model`, `prompt`, `best_of` = 1, `echo` = FALSE, `frequency_penalty` = 0, `logit_bias` = NULL, `logprobs` = NULL, `max_tokens` = 16, `n` = 1, `presence_penalty` = 0, `seed` = NULL, `stop` = NULL, `stream` = FALSE, `suffix` = NULL, `temperature` = 1, `top_p` = 1, `user` = NULL, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`prompt`)) {
        stopifnot(R6::is.R6(`prompt`))
        self$`prompt` <- `prompt`
      }
      if (!is.null(`best_of`)) {
        if (!(is.numeric(`best_of`) && length(`best_of`) == 1)) {
          stop(paste("Error! Invalid data for `best_of`. Must be an integer:", `best_of`))
        }
        self$`best_of` <- `best_of`
      }
      if (!is.null(`echo`)) {
        if (!(is.logical(`echo`) && length(`echo`) == 1)) {
          stop(paste("Error! Invalid data for `echo`. Must be a boolean:", `echo`))
        }
        self$`echo` <- `echo`
      }
      if (!is.null(`frequency_penalty`)) {
        self$`frequency_penalty` <- `frequency_penalty`
      }
      if (!is.null(`logit_bias`)) {
        stopifnot(is.vector(`logit_bias`), length(`logit_bias`) != 0)
        sapply(`logit_bias`, function(x) stopifnot(is.character(x)))
        self$`logit_bias` <- `logit_bias`
      }
      if (!is.null(`logprobs`)) {
        if (!(is.numeric(`logprobs`) && length(`logprobs`) == 1)) {
          stop(paste("Error! Invalid data for `logprobs`. Must be an integer:", `logprobs`))
        }
        self$`logprobs` <- `logprobs`
      }
      if (!is.null(`max_tokens`)) {
        if (!(is.numeric(`max_tokens`) && length(`max_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_tokens`. Must be an integer:", `max_tokens`))
        }
        self$`max_tokens` <- `max_tokens`
      }
      if (!is.null(`n`)) {
        if (!(is.numeric(`n`) && length(`n`) == 1)) {
          stop(paste("Error! Invalid data for `n`. Must be an integer:", `n`))
        }
        self$`n` <- `n`
      }
      if (!is.null(`presence_penalty`)) {
        self$`presence_penalty` <- `presence_penalty`
      }
      if (!is.null(`seed`)) {
        if (!(is.numeric(`seed`) && length(`seed`) == 1)) {
          stop(paste("Error! Invalid data for `seed`. Must be an integer:", `seed`))
        }
        self$`seed` <- `seed`
      }
      if (!is.null(`stop`)) {
        stopifnot(R6::is.R6(`stop`))
        self$`stop` <- `stop`
      }
      if (!is.null(`stream`)) {
        if (!(is.logical(`stream`) && length(`stream`) == 1)) {
          stop(paste("Error! Invalid data for `stream`. Must be a boolean:", `stream`))
        }
        self$`stream` <- `stream`
      }
      if (!is.null(`suffix`)) {
        if (!(is.character(`suffix`) && length(`suffix`) == 1)) {
          stop(paste("Error! Invalid data for `suffix`. Must be a string:", `suffix`))
        }
        self$`suffix` <- `suffix`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
      if (!is.null(`top_p`)) {
        self$`top_p` <- `top_p`
      }
      if (!is.null(`user`)) {
        if (!(is.character(`user`) && length(`user`) == 1)) {
          stop(paste("Error! Invalid data for `user`. Must be a string:", `user`))
        }
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionRequest in JSON format
    toJSON = function() {
      CreateCompletionRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateCompletionRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`prompt`)) {
        CreateCompletionRequestObject[["prompt"]] <-
          self$`prompt`$toJSON()
      }
      if (!is.null(self$`best_of`)) {
        CreateCompletionRequestObject[["best_of"]] <-
          self$`best_of`
      }
      if (!is.null(self$`echo`)) {
        CreateCompletionRequestObject[["echo"]] <-
          self$`echo`
      }
      if (!is.null(self$`frequency_penalty`)) {
        CreateCompletionRequestObject[["frequency_penalty"]] <-
          self$`frequency_penalty`
      }
      if (!is.null(self$`logit_bias`)) {
        CreateCompletionRequestObject[["logit_bias"]] <-
          self$`logit_bias`
      }
      if (!is.null(self$`logprobs`)) {
        CreateCompletionRequestObject[["logprobs"]] <-
          self$`logprobs`
      }
      if (!is.null(self$`max_tokens`)) {
        CreateCompletionRequestObject[["max_tokens"]] <-
          self$`max_tokens`
      }
      if (!is.null(self$`n`)) {
        CreateCompletionRequestObject[["n"]] <-
          self$`n`
      }
      if (!is.null(self$`presence_penalty`)) {
        CreateCompletionRequestObject[["presence_penalty"]] <-
          self$`presence_penalty`
      }
      if (!is.null(self$`seed`)) {
        CreateCompletionRequestObject[["seed"]] <-
          self$`seed`
      }
      if (!is.null(self$`stop`)) {
        CreateCompletionRequestObject[["stop"]] <-
          self$`stop`$toJSON()
      }
      if (!is.null(self$`stream`)) {
        CreateCompletionRequestObject[["stream"]] <-
          self$`stream`
      }
      if (!is.null(self$`suffix`)) {
        CreateCompletionRequestObject[["suffix"]] <-
          self$`suffix`
      }
      if (!is.null(self$`temperature`)) {
        CreateCompletionRequestObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`top_p`)) {
        CreateCompletionRequestObject[["top_p"]] <-
          self$`top_p`
      }
      if (!is.null(self$`user`)) {
        CreateCompletionRequestObject[["user"]] <-
          self$`user`
      }
      CreateCompletionRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateCompletionRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`prompt`)) {
        `prompt_object` <- CreateCompletionRequestPrompt$new()
        `prompt_object`$fromJSON(jsonlite::toJSON(this_object$`prompt`, auto_unbox = TRUE, digits = NA))
        self$`prompt` <- `prompt_object`
      }
      if (!is.null(this_object$`best_of`)) {
        self$`best_of` <- this_object$`best_of`
      }
      if (!is.null(this_object$`echo`)) {
        self$`echo` <- this_object$`echo`
      }
      if (!is.null(this_object$`frequency_penalty`)) {
        self$`frequency_penalty` <- this_object$`frequency_penalty`
      }
      if (!is.null(this_object$`logit_bias`)) {
        self$`logit_bias` <- ApiClient$new()$deserializeObj(this_object$`logit_bias`, "map(integer)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`logprobs`)) {
        self$`logprobs` <- this_object$`logprobs`
      }
      if (!is.null(this_object$`max_tokens`)) {
        self$`max_tokens` <- this_object$`max_tokens`
      }
      if (!is.null(this_object$`n`)) {
        self$`n` <- this_object$`n`
      }
      if (!is.null(this_object$`presence_penalty`)) {
        self$`presence_penalty` <- this_object$`presence_penalty`
      }
      if (!is.null(this_object$`seed`)) {
        self$`seed` <- this_object$`seed`
      }
      if (!is.null(this_object$`stop`)) {
        `stop_object` <- CreateCompletionRequestStop$new()
        `stop_object`$fromJSON(jsonlite::toJSON(this_object$`stop`, auto_unbox = TRUE, digits = NA))
        self$`stop` <- `stop_object`
      }
      if (!is.null(this_object$`stream`)) {
        self$`stream` <- this_object$`stream`
      }
      if (!is.null(this_object$`suffix`)) {
        self$`suffix` <- this_object$`suffix`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`top_p`)) {
        self$`top_p` <- this_object$`top_p`
      }
      if (!is.null(this_object$`user`)) {
        self$`user` <- this_object$`user`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`prompt`)) {
          sprintf(
          '"prompt":
          %s
          ',
          jsonlite::toJSON(self$`prompt`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`best_of`)) {
          sprintf(
          '"best_of":
            %d
                    ',
          self$`best_of`
          )
        },
        if (!is.null(self$`echo`)) {
          sprintf(
          '"echo":
            %s
                    ',
          tolower(self$`echo`)
          )
        },
        if (!is.null(self$`frequency_penalty`)) {
          sprintf(
          '"frequency_penalty":
            %d
                    ',
          self$`frequency_penalty`
          )
        },
        if (!is.null(self$`logit_bias`)) {
          sprintf(
          '"logit_bias":
            %s
          ',
          jsonlite::toJSON(lapply(self$`logit_bias`, function(x){ x }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`logprobs`)) {
          sprintf(
          '"logprobs":
            %d
                    ',
          self$`logprobs`
          )
        },
        if (!is.null(self$`max_tokens`)) {
          sprintf(
          '"max_tokens":
            %d
                    ',
          self$`max_tokens`
          )
        },
        if (!is.null(self$`n`)) {
          sprintf(
          '"n":
            %d
                    ',
          self$`n`
          )
        },
        if (!is.null(self$`presence_penalty`)) {
          sprintf(
          '"presence_penalty":
            %d
                    ',
          self$`presence_penalty`
          )
        },
        if (!is.null(self$`seed`)) {
          sprintf(
          '"seed":
            %d
                    ',
          self$`seed`
          )
        },
        if (!is.null(self$`stop`)) {
          sprintf(
          '"stop":
          %s
          ',
          jsonlite::toJSON(self$`stop`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`stream`)) {
          sprintf(
          '"stream":
            %s
                    ',
          tolower(self$`stream`)
          )
        },
        if (!is.null(self$`suffix`)) {
          sprintf(
          '"suffix":
            "%s"
                    ',
          self$`suffix`
          )
        },
        if (!is.null(self$`temperature`)) {
          sprintf(
          '"temperature":
            %d
                    ',
          self$`temperature`
          )
        },
        if (!is.null(self$`top_p`)) {
          sprintf(
          '"top_p":
            %d
                    ',
          self$`top_p`
          )
        },
        if (!is.null(self$`user`)) {
          sprintf(
          '"user":
            "%s"
                    ',
          self$`user`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateCompletionRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`prompt` <- CreateCompletionRequestPrompt$new()$fromJSON(jsonlite::toJSON(this_object$`prompt`, auto_unbox = TRUE, digits = NA))
      self$`best_of` <- this_object$`best_of`
      self$`echo` <- this_object$`echo`
      self$`frequency_penalty` <- this_object$`frequency_penalty`
      self$`logit_bias` <- ApiClient$new()$deserializeObj(this_object$`logit_bias`, "map(integer)", loadNamespace("openapi"))
      self$`logprobs` <- this_object$`logprobs`
      self$`max_tokens` <- this_object$`max_tokens`
      self$`n` <- this_object$`n`
      self$`presence_penalty` <- this_object$`presence_penalty`
      self$`seed` <- this_object$`seed`
      self$`stop` <- CreateCompletionRequestStop$new()$fromJSON(jsonlite::toJSON(this_object$`stop`, auto_unbox = TRUE, digits = NA))
      self$`stream` <- this_object$`stream`
      self$`suffix` <- this_object$`suffix`
      self$`temperature` <- this_object$`temperature`
      self$`top_p` <- this_object$`top_p`
      self$`user` <- this_object$`user`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateCompletionRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionRequest: the required field `model` is missing."))
      }
      # check the required field `prompt`
      if (!is.null(input_json$`prompt`)) {
        stopifnot(R6::is.R6(input_json$`prompt`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionRequest: the required field `prompt` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateCompletionRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      if (self$`best_of` > 20) {
        return(FALSE)
      }
      if (self$`best_of` < 0) {
        return(FALSE)
      }

      if (self$`frequency_penalty` > 2) {
        return(FALSE)
      }
      if (self$`frequency_penalty` < -2) {
        return(FALSE)
      }

      if (self$`logprobs` > 5) {
        return(FALSE)
      }
      if (self$`logprobs` < 0) {
        return(FALSE)
      }

      if (self$`max_tokens` < 0) {
        return(FALSE)
      }

      if (self$`n` > 128) {
        return(FALSE)
      }
      if (self$`n` < 1) {
        return(FALSE)
      }

      if (self$`presence_penalty` > 2) {
        return(FALSE)
      }
      if (self$`presence_penalty` < -2) {
        return(FALSE)
      }

      if (self$`seed` > 9223372036854775807) {
        return(FALSE)
      }
      if (self$`seed` < -9223372036854775808) {
        return(FALSE)
      }

      if (self$`temperature` > 2) {
        return(FALSE)
      }
      if (self$`temperature` < 0) {
        return(FALSE)
      }

      if (self$`top_p` > 1) {
        return(FALSE)
      }
      if (self$`top_p` < 0) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      if (self$`best_of` > 20) {
        invalid_fields["best_of"] <- "Invalid value for `best_of`, must be smaller than or equal to 20."
      }
      if (self$`best_of` < 0) {
        invalid_fields["best_of"] <- "Invalid value for `best_of`, must be bigger than or equal to 0."
      }

      if (self$`frequency_penalty` > 2) {
        invalid_fields["frequency_penalty"] <- "Invalid value for `frequency_penalty`, must be smaller than or equal to 2."
      }
      if (self$`frequency_penalty` < -2) {
        invalid_fields["frequency_penalty"] <- "Invalid value for `frequency_penalty`, must be bigger than or equal to -2."
      }

      if (self$`logprobs` > 5) {
        invalid_fields["logprobs"] <- "Invalid value for `logprobs`, must be smaller than or equal to 5."
      }
      if (self$`logprobs` < 0) {
        invalid_fields["logprobs"] <- "Invalid value for `logprobs`, must be bigger than or equal to 0."
      }

      if (self$`max_tokens` < 0) {
        invalid_fields["max_tokens"] <- "Invalid value for `max_tokens`, must be bigger than or equal to 0."
      }

      if (self$`n` > 128) {
        invalid_fields["n"] <- "Invalid value for `n`, must be smaller than or equal to 128."
      }
      if (self$`n` < 1) {
        invalid_fields["n"] <- "Invalid value for `n`, must be bigger than or equal to 1."
      }

      if (self$`presence_penalty` > 2) {
        invalid_fields["presence_penalty"] <- "Invalid value for `presence_penalty`, must be smaller than or equal to 2."
      }
      if (self$`presence_penalty` < -2) {
        invalid_fields["presence_penalty"] <- "Invalid value for `presence_penalty`, must be bigger than or equal to -2."
      }

      if (self$`seed` > 9223372036854775807) {
        invalid_fields["seed"] <- "Invalid value for `seed`, must be smaller than or equal to 9223372036854775807."
      }
      if (self$`seed` < -9223372036854775808) {
        invalid_fields["seed"] <- "Invalid value for `seed`, must be bigger than or equal to -9223372036854775808."
      }

      if (self$`temperature` > 2) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be smaller than or equal to 2."
      }
      if (self$`temperature` < 0) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be bigger than or equal to 0."
      }

      if (self$`top_p` > 1) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be smaller than or equal to 1."
      }
      if (self$`top_p` < 0) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be bigger than or equal to 0."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateCompletionRequest$unlock()
#
## Below is an example to define the print function
# CreateCompletionRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionRequest$lock()

