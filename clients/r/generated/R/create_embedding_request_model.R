#' @docType class
#' @title CreateEmbeddingRequestModel
#'
#' @description CreateEmbeddingRequestModel Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEmbeddingRequestModel <- R6::R6Class(
  "CreateEmbeddingRequestModel",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("character"),

    #' @description
    #' Initialize a new CreateEmbeddingRequestModel.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "character"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else {
        stop(paste("Failed to initialize CreateEmbeddingRequestModel with anyOf schemas character. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequestModel.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CreateEmbeddingRequestModel.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequestModel.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CreateEmbeddingRequestModel.
    fromJSON = function(input) {
      error_messages <- list()

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          self$actual_instance <- `character_instance`$fromJSON(input)
          self$actual_type <- "character"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          self$actual_instance <- `character_instance`$fromJSON(input)
          self$actual_type <- "character"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CreateEmbeddingRequestModel with anyOf schemas character. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },

    #' @description
    #' Serialize CreateEmbeddingRequestModel to JSON string.
    #'
    #' @return JSON string representation of the CreateEmbeddingRequestModel.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CreateEmbeddingRequestModel to JSON.
    #'
    #' @return JSON representation of the CreateEmbeddingRequestModel.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CreateEmbeddingRequestModel and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CreateEmbeddingRequestModel$unlock()
#
## Below is an example to define the print function
#CreateEmbeddingRequestModel$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CreateEmbeddingRequestModel$lock()

