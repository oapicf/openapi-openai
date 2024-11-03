/*
 * CompletionUsage.h
 *
 * Usage statistics for the completion request.
 */

#ifndef _CompletionUsage_H_
#define _CompletionUsage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Usage statistics for the completion request.
 *
 *  \ingroup Models
 *
 */

class CompletionUsage : public Object {
public:
	/*! \brief Constructor.
	 */
	CompletionUsage();
	CompletionUsage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CompletionUsage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of tokens in the generated completion.
	 */
	int getCompletionTokens();

	/*! \brief Set Number of tokens in the generated completion.
	 */
	void setCompletionTokens(int  completion_tokens);
	/*! \brief Get Number of tokens in the prompt.
	 */
	int getPromptTokens();

	/*! \brief Set Number of tokens in the prompt.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get Total number of tokens used in the request (prompt + completion).
	 */
	int getTotalTokens();

	/*! \brief Set Total number of tokens used in the request (prompt + completion).
	 */
	void setTotalTokens(int  total_tokens);

private:
	int completion_tokens;
	int prompt_tokens;
	int total_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CompletionUsage_H_ */
