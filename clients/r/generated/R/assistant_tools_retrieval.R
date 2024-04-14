#' Create a new AssistantToolsRetrieval
#'
#' @description
#' AssistantToolsRetrieval Class
#'
#' @docType class
#' @title AssistantToolsRetrieval
#' @description AssistantToolsRetrieval Class
#' @format An \code{R6Class} generator object
#' @field type The type of tool being defined: `retrieval` character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantToolsRetrieval <- R6::R6Class(
  "AssistantToolsRetrieval",
  public = list(
    `type` = NULL,
    #' Initialize a new AssistantToolsRetrieval class.
    #'
    #' @description
    #' Initialize a new AssistantToolsRetrieval class.
    #'
    #' @param type The type of tool being defined: `retrieval`
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("retrieval"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantToolsRetrieval in JSON format
    #' @export
    toJSON = function() {
      AssistantToolsRetrievalObject <- list()
      if (!is.null(self$`type`)) {
        AssistantToolsRetrievalObject[["type"]] <-
          self$`type`
      }
      AssistantToolsRetrievalObject
    },
    #' Deserialize JSON string into an instance of AssistantToolsRetrieval
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsRetrieval
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsRetrieval
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("retrieval"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AssistantToolsRetrieval in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AssistantToolsRetrieval
    #'
    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsRetrieval
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsRetrieval
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("retrieval"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to AssistantToolsRetrieval
    #'
    #' @description
    #' Validate JSON input with respect to AssistantToolsRetrieval and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantToolsRetrieval: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantToolsRetrieval
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# AssistantToolsRetrieval$unlock()
#
## Below is an example to define the print function
# AssistantToolsRetrieval$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantToolsRetrieval$lock()

