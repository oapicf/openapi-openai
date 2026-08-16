
/*
 * ChatCompletionStreamOptions.h
 *
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionStreamOptions_H_
#define TINY_CPP_CLIENT_ChatCompletionStreamOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Options for streaming response. Only set this when you set `stream: true`. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionStreamOptions{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionStreamOptions();
    ChatCompletionStreamOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionStreamOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
	 */
	bool isIncludeUsage();

	/*! \brief Set If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
	 */
	void setIncludeUsage(bool  include_usage);


    private:
    bool include_usage{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionStreamOptions_H_ */
