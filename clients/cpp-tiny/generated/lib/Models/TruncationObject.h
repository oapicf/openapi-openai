
/*
 * TruncationObject.h
 *
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 */

#ifndef TINY_CPP_CLIENT_TruncationObject_H_
#define TINY_CPP_CLIENT_TruncationObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 *
 *  \ingroup Models
 *
 */

class TruncationObject{
public:

    /*! \brief Constructor.
	 */
    TruncationObject();
    TruncationObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TruncationObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
	 */
	std::string getType();

	/*! \brief Set The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
	 */
	void setType(std::string  type);
	/*! \brief Get The number of most recent messages from the thread when constructing the context for the run.
	 */
	int getLastMessages();

	/*! \brief Set The number of most recent messages from the thread when constructing the context for the run.
	 */
	void setLastMessages(int  last_messages);


    private:
    std::string type{};
    int last_messages{};
};
}

#endif /* TINY_CPP_CLIENT_TruncationObject_H_ */
