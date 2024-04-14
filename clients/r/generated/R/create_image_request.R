#' Create a new CreateImageRequest
#'
#' @description
#' CreateImageRequest Class
#'
#' @docType class
#' @title CreateImageRequest
#' @description CreateImageRequest Class
#' @format An \code{R6Class} generator object
#' @field prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. character
#' @field model  \link{CreateImageRequestModel} [optional]
#' @field n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. integer [optional]
#' @field quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. character [optional]
#' @field response_format The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. character [optional]
#' @field size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. character [optional]
#' @field style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. character [optional]
#' @field user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateImageRequest <- R6::R6Class(
  "CreateImageRequest",
  public = list(
    `prompt` = NULL,
    `model` = NULL,
    `n` = NULL,
    `quality` = NULL,
    `response_format` = NULL,
    `size` = NULL,
    `style` = NULL,
    `user` = NULL,
    #' Initialize a new CreateImageRequest class.
    #'
    #' @description
    #' Initialize a new CreateImageRequest class.
    #'
    #' @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
    #' @param model model
    #' @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.. Default to 1.
    #' @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.. Default to "standard".
    #' @param response_format The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.. Default to "url".
    #' @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.. Default to "1024x1024".
    #' @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.. Default to "vivid".
    #' @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`prompt`, `model` = NULL, `n` = 1, `quality` = "standard", `response_format` = "url", `size` = "1024x1024", `style` = "vivid", `user` = NULL, ...) {
      if (!missing(`prompt`)) {
        if (!(is.character(`prompt`) && length(`prompt`) == 1)) {
          stop(paste("Error! Invalid data for `prompt`. Must be a string:", `prompt`))
        }
        self$`prompt` <- `prompt`
      }
      if (!is.null(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!is.null(`n`)) {
        if (!(is.numeric(`n`) && length(`n`) == 1)) {
          stop(paste("Error! Invalid data for `n`. Must be an integer:", `n`))
        }
        self$`n` <- `n`
      }
      if (!is.null(`quality`)) {
        if (!(`quality` %in% c("standard", "hd"))) {
          stop(paste("Error! \"", `quality`, "\" cannot be assigned to `quality`. Must be \"standard\", \"hd\".", sep = ""))
        }
        if (!(is.character(`quality`) && length(`quality`) == 1)) {
          stop(paste("Error! Invalid data for `quality`. Must be a string:", `quality`))
        }
        self$`quality` <- `quality`
      }
      if (!is.null(`response_format`)) {
        if (!(`response_format` %in% c("url", "b64_json"))) {
          stop(paste("Error! \"", `response_format`, "\" cannot be assigned to `response_format`. Must be \"url\", \"b64_json\".", sep = ""))
        }
        if (!(is.character(`response_format`) && length(`response_format`) == 1)) {
          stop(paste("Error! Invalid data for `response_format`. Must be a string:", `response_format`))
        }
        self$`response_format` <- `response_format`
      }
      if (!is.null(`size`)) {
        if (!(`size` %in% c("256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"))) {
          stop(paste("Error! \"", `size`, "\" cannot be assigned to `size`. Must be \"256x256\", \"512x512\", \"1024x1024\", \"1792x1024\", \"1024x1792\".", sep = ""))
        }
        if (!(is.character(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be a string:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`style`)) {
        if (!(`style` %in% c("vivid", "natural"))) {
          stop(paste("Error! \"", `style`, "\" cannot be assigned to `style`. Must be \"vivid\", \"natural\".", sep = ""))
        }
        if (!(is.character(`style`) && length(`style`) == 1)) {
          stop(paste("Error! Invalid data for `style`. Must be a string:", `style`))
        }
        self$`style` <- `style`
      }
      if (!is.null(`user`)) {
        if (!(is.character(`user`) && length(`user`) == 1)) {
          stop(paste("Error! Invalid data for `user`. Must be a string:", `user`))
        }
        self$`user` <- `user`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateImageRequest in JSON format
    #' @export
    toJSON = function() {
      CreateImageRequestObject <- list()
      if (!is.null(self$`prompt`)) {
        CreateImageRequestObject[["prompt"]] <-
          self$`prompt`
      }
      if (!is.null(self$`model`)) {
        CreateImageRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`n`)) {
        CreateImageRequestObject[["n"]] <-
          self$`n`
      }
      if (!is.null(self$`quality`)) {
        CreateImageRequestObject[["quality"]] <-
          self$`quality`
      }
      if (!is.null(self$`response_format`)) {
        CreateImageRequestObject[["response_format"]] <-
          self$`response_format`
      }
      if (!is.null(self$`size`)) {
        CreateImageRequestObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`style`)) {
        CreateImageRequestObject[["style"]] <-
          self$`style`
      }
      if (!is.null(self$`user`)) {
        CreateImageRequestObject[["user"]] <-
          self$`user`
      }
      CreateImageRequestObject
    },
    #' Deserialize JSON string into an instance of CreateImageRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateImageRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateImageRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`prompt`)) {
        self$`prompt` <- this_object$`prompt`
      }
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateImageRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`n`)) {
        self$`n` <- this_object$`n`
      }
      if (!is.null(this_object$`quality`)) {
        if (!is.null(this_object$`quality`) && !(this_object$`quality` %in% c("standard", "hd"))) {
          stop(paste("Error! \"", this_object$`quality`, "\" cannot be assigned to `quality`. Must be \"standard\", \"hd\".", sep = ""))
        }
        self$`quality` <- this_object$`quality`
      }
      if (!is.null(this_object$`response_format`)) {
        if (!is.null(this_object$`response_format`) && !(this_object$`response_format` %in% c("url", "b64_json"))) {
          stop(paste("Error! \"", this_object$`response_format`, "\" cannot be assigned to `response_format`. Must be \"url\", \"b64_json\".", sep = ""))
        }
        self$`response_format` <- this_object$`response_format`
      }
      if (!is.null(this_object$`size`)) {
        if (!is.null(this_object$`size`) && !(this_object$`size` %in% c("256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"))) {
          stop(paste("Error! \"", this_object$`size`, "\" cannot be assigned to `size`. Must be \"256x256\", \"512x512\", \"1024x1024\", \"1792x1024\", \"1024x1792\".", sep = ""))
        }
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`style`)) {
        if (!is.null(this_object$`style`) && !(this_object$`style` %in% c("vivid", "natural"))) {
          stop(paste("Error! \"", this_object$`style`, "\" cannot be assigned to `style`. Must be \"vivid\", \"natural\".", sep = ""))
        }
        self$`style` <- this_object$`style`
      }
      if (!is.null(this_object$`user`)) {
        self$`user` <- this_object$`user`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateImageRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`prompt`)) {
          sprintf(
          '"prompt":
            "%s"
                    ',
          self$`prompt`
          )
        },
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`quality`)) {
          sprintf(
          '"quality":
            "%s"
                    ',
          self$`quality`
          )
        },
        if (!is.null(self$`response_format`)) {
          sprintf(
          '"response_format":
            "%s"
                    ',
          self$`response_format`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            "%s"
                    ',
          self$`size`
          )
        },
        if (!is.null(self$`style`)) {
          sprintf(
          '"style":
            "%s"
                    ',
          self$`style`
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
    #' Deserialize JSON string into an instance of CreateImageRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateImageRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateImageRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`prompt` <- this_object$`prompt`
      self$`model` <- CreateImageRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`n` <- this_object$`n`
      if (!is.null(this_object$`quality`) && !(this_object$`quality` %in% c("standard", "hd"))) {
        stop(paste("Error! \"", this_object$`quality`, "\" cannot be assigned to `quality`. Must be \"standard\", \"hd\".", sep = ""))
      }
      self$`quality` <- this_object$`quality`
      if (!is.null(this_object$`response_format`) && !(this_object$`response_format` %in% c("url", "b64_json"))) {
        stop(paste("Error! \"", this_object$`response_format`, "\" cannot be assigned to `response_format`. Must be \"url\", \"b64_json\".", sep = ""))
      }
      self$`response_format` <- this_object$`response_format`
      if (!is.null(this_object$`size`) && !(this_object$`size` %in% c("256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"))) {
        stop(paste("Error! \"", this_object$`size`, "\" cannot be assigned to `size`. Must be \"256x256\", \"512x512\", \"1024x1024\", \"1792x1024\", \"1024x1792\".", sep = ""))
      }
      self$`size` <- this_object$`size`
      if (!is.null(this_object$`style`) && !(this_object$`style` %in% c("vivid", "natural"))) {
        stop(paste("Error! \"", this_object$`style`, "\" cannot be assigned to `style`. Must be \"vivid\", \"natural\".", sep = ""))
      }
      self$`style` <- this_object$`style`
      self$`user` <- this_object$`user`
      self
    },
    #' Validate JSON input with respect to CreateImageRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateImageRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `prompt`
      if (!is.null(input_json$`prompt`)) {
        if (!(is.character(input_json$`prompt`) && length(input_json$`prompt`) == 1)) {
          stop(paste("Error! Invalid data for `prompt`. Must be a string:", input_json$`prompt`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateImageRequest: the required field `prompt` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateImageRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `prompt` is null
      if (is.null(self$`prompt`)) {
        return(FALSE)
      }

      if (self$`n` > 10) {
        return(FALSE)
      }
      if (self$`n` < 1) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `prompt` is null
      if (is.null(self$`prompt`)) {
        invalid_fields["prompt"] <- "Non-nullable required field `prompt` cannot be null."
      }

      if (self$`n` > 10) {
        invalid_fields["n"] <- "Invalid value for `n`, must be smaller than or equal to 10."
      }
      if (self$`n` < 1) {
        invalid_fields["n"] <- "Invalid value for `n`, must be bigger than or equal to 1."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateImageRequest$unlock()
#
## Below is an example to define the print function
# CreateImageRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateImageRequest$lock()

