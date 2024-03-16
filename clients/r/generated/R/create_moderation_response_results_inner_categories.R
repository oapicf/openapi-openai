#' Create a new CreateModerationResponseResultsInnerCategories
#'
#' @description
#' CreateModerationResponseResultsInnerCategories Class
#'
#' @docType class
#' @title CreateModerationResponseResultsInnerCategories
#' @description CreateModerationResponseResultsInnerCategories Class
#' @format An \code{R6Class} generator object
#' @field hate  character
#' @field hate/threatening  character
#' @field self-harm  character
#' @field sexual  character
#' @field sexual/minors  character
#' @field violence  character
#' @field violence/graphic  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInnerCategories <- R6::R6Class(
  "CreateModerationResponseResultsInnerCategories",
  public = list(
    `hate` = NULL,
    `hate/threatening` = NULL,
    `self-harm` = NULL,
    `sexual` = NULL,
    `sexual/minors` = NULL,
    `violence` = NULL,
    `violence/graphic` = NULL,
    #' Initialize a new CreateModerationResponseResultsInnerCategories class.
    #'
    #' @description
    #' Initialize a new CreateModerationResponseResultsInnerCategories class.
    #'
    #' @param hate hate
    #' @param hate/threatening hate/threatening
    #' @param self-harm self-harm
    #' @param sexual sexual
    #' @param sexual/minors sexual/minors
    #' @param violence violence
    #' @param violence/graphic violence/graphic
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hate`, `hate/threatening`, `self-harm`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`, ...) {
      if (!missing(`hate`)) {
        if (!(is.logical(`hate`) && length(`hate`) == 1)) {
          stop(paste("Error! Invalid data for `hate`. Must be a boolean:", `hate`))
        }
        self$`hate` <- `hate`
      }
      if (!missing(`hate/threatening`)) {
        if (!(is.logical(`hate/threatening`) && length(`hate/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `hate/threatening`. Must be a boolean:", `hate/threatening`))
        }
        self$`hate/threatening` <- `hate/threatening`
      }
      if (!missing(`self-harm`)) {
        if (!(is.logical(`self-harm`) && length(`self-harm`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm`. Must be a boolean:", `self-harm`))
        }
        self$`self-harm` <- `self-harm`
      }
      if (!missing(`sexual`)) {
        if (!(is.logical(`sexual`) && length(`sexual`) == 1)) {
          stop(paste("Error! Invalid data for `sexual`. Must be a boolean:", `sexual`))
        }
        self$`sexual` <- `sexual`
      }
      if (!missing(`sexual/minors`)) {
        if (!(is.logical(`sexual/minors`) && length(`sexual/minors`) == 1)) {
          stop(paste("Error! Invalid data for `sexual/minors`. Must be a boolean:", `sexual/minors`))
        }
        self$`sexual/minors` <- `sexual/minors`
      }
      if (!missing(`violence`)) {
        if (!(is.logical(`violence`) && length(`violence`) == 1)) {
          stop(paste("Error! Invalid data for `violence`. Must be a boolean:", `violence`))
        }
        self$`violence` <- `violence`
      }
      if (!missing(`violence/graphic`)) {
        if (!(is.logical(`violence/graphic`) && length(`violence/graphic`) == 1)) {
          stop(paste("Error! Invalid data for `violence/graphic`. Must be a boolean:", `violence/graphic`))
        }
        self$`violence/graphic` <- `violence/graphic`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategories in JSON format
    #' @export
    toJSON = function() {
      CreateModerationResponseResultsInnerCategoriesObject <- list()
      if (!is.null(self$`hate`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["hate"]] <-
          self$`hate`
      }
      if (!is.null(self$`hate/threatening`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["hate/threatening"]] <-
          self$`hate/threatening`
      }
      if (!is.null(self$`self-harm`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["self-harm"]] <-
          self$`self-harm`
      }
      if (!is.null(self$`sexual`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["sexual"]] <-
          self$`sexual`
      }
      if (!is.null(self$`sexual/minors`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["sexual/minors"]] <-
          self$`sexual/minors`
      }
      if (!is.null(self$`violence`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["violence"]] <-
          self$`violence`
      }
      if (!is.null(self$`violence/graphic`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["violence/graphic"]] <-
          self$`violence/graphic`
      }
      CreateModerationResponseResultsInnerCategoriesObject
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategories
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hate`)) {
        self$`hate` <- this_object$`hate`
      }
      if (!is.null(this_object$`hate/threatening`)) {
        self$`hate/threatening` <- this_object$`hate/threatening`
      }
      if (!is.null(this_object$`self-harm`)) {
        self$`self-harm` <- this_object$`self-harm`
      }
      if (!is.null(this_object$`sexual`)) {
        self$`sexual` <- this_object$`sexual`
      }
      if (!is.null(this_object$`sexual/minors`)) {
        self$`sexual/minors` <- this_object$`sexual/minors`
      }
      if (!is.null(this_object$`violence`)) {
        self$`violence` <- this_object$`violence`
      }
      if (!is.null(this_object$`violence/graphic`)) {
        self$`violence/graphic` <- this_object$`violence/graphic`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategories in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hate`)) {
          sprintf(
          '"hate":
            %s
                    ',
          tolower(self$`hate`)
          )
        },
        if (!is.null(self$`hate/threatening`)) {
          sprintf(
          '"hate/threatening":
            %s
                    ',
          tolower(self$`hate/threatening`)
          )
        },
        if (!is.null(self$`self-harm`)) {
          sprintf(
          '"self-harm":
            %s
                    ',
          tolower(self$`self-harm`)
          )
        },
        if (!is.null(self$`sexual`)) {
          sprintf(
          '"sexual":
            %s
                    ',
          tolower(self$`sexual`)
          )
        },
        if (!is.null(self$`sexual/minors`)) {
          sprintf(
          '"sexual/minors":
            %s
                    ',
          tolower(self$`sexual/minors`)
          )
        },
        if (!is.null(self$`violence`)) {
          sprintf(
          '"violence":
            %s
                    ',
          tolower(self$`violence`)
          )
        },
        if (!is.null(self$`violence/graphic`)) {
          sprintf(
          '"violence/graphic":
            %s
                    ',
          tolower(self$`violence/graphic`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategories
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hate` <- this_object$`hate`
      self$`hate/threatening` <- this_object$`hate/threatening`
      self$`self-harm` <- this_object$`self-harm`
      self$`sexual` <- this_object$`sexual`
      self$`sexual/minors` <- this_object$`sexual/minors`
      self$`violence` <- this_object$`violence`
      self$`violence/graphic` <- this_object$`violence/graphic`
      self
    },
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategories
    #'
    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategories and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hate`
      if (!is.null(input_json$`hate`)) {
        if (!(is.logical(input_json$`hate`) && length(input_json$`hate`) == 1)) {
          stop(paste("Error! Invalid data for `hate`. Must be a boolean:", input_json$`hate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `hate` is missing."))
      }
      # check the required field `hate/threatening`
      if (!is.null(input_json$`hate/threatening`)) {
        if (!(is.logical(input_json$`hate/threatening`) && length(input_json$`hate/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `hate/threatening`. Must be a boolean:", input_json$`hate/threatening`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `hate/threatening` is missing."))
      }
      # check the required field `self-harm`
      if (!is.null(input_json$`self-harm`)) {
        if (!(is.logical(input_json$`self-harm`) && length(input_json$`self-harm`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm`. Must be a boolean:", input_json$`self-harm`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `self-harm` is missing."))
      }
      # check the required field `sexual`
      if (!is.null(input_json$`sexual`)) {
        if (!(is.logical(input_json$`sexual`) && length(input_json$`sexual`) == 1)) {
          stop(paste("Error! Invalid data for `sexual`. Must be a boolean:", input_json$`sexual`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `sexual` is missing."))
      }
      # check the required field `sexual/minors`
      if (!is.null(input_json$`sexual/minors`)) {
        if (!(is.logical(input_json$`sexual/minors`) && length(input_json$`sexual/minors`) == 1)) {
          stop(paste("Error! Invalid data for `sexual/minors`. Must be a boolean:", input_json$`sexual/minors`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `sexual/minors` is missing."))
      }
      # check the required field `violence`
      if (!is.null(input_json$`violence`)) {
        if (!(is.logical(input_json$`violence`) && length(input_json$`violence`) == 1)) {
          stop(paste("Error! Invalid data for `violence`. Must be a boolean:", input_json$`violence`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `violence` is missing."))
      }
      # check the required field `violence/graphic`
      if (!is.null(input_json$`violence/graphic`)) {
        if (!(is.logical(input_json$`violence/graphic`) && length(input_json$`violence/graphic`) == 1)) {
          stop(paste("Error! Invalid data for `violence/graphic`. Must be a boolean:", input_json$`violence/graphic`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `violence/graphic` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInnerCategories
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
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        return(FALSE)
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        return(FALSE)
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        return(FALSE)
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        return(FALSE)
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        return(FALSE)
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        return(FALSE)
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
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
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        invalid_fields["hate"] <- "Non-nullable required field `hate` cannot be null."
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        invalid_fields["hate/threatening"] <- "Non-nullable required field `hate/threatening` cannot be null."
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        invalid_fields["self-harm"] <- "Non-nullable required field `self-harm` cannot be null."
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        invalid_fields["sexual"] <- "Non-nullable required field `sexual` cannot be null."
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        invalid_fields["sexual/minors"] <- "Non-nullable required field `sexual/minors` cannot be null."
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        invalid_fields["violence"] <- "Non-nullable required field `violence` cannot be null."
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
        invalid_fields["violence/graphic"] <- "Non-nullable required field `violence/graphic` cannot be null."
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
# CreateModerationResponseResultsInnerCategories$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInnerCategories$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInnerCategories$lock()

