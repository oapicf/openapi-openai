/*
 * FileSearchRankingOptions.h
 *
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */

#ifndef _FileSearchRankingOptions_H_
#define _FileSearchRankingOptions_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 *
 *  \ingroup Models
 *
 */

class FileSearchRankingOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	FileSearchRankingOptions();
	FileSearchRankingOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FileSearchRankingOptions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ranker to use for the file search. If not specified will use the `auto` ranker.
	 */
	std::string getRanker();

	/*! \brief Set The ranker to use for the file search. If not specified will use the `auto` ranker.
	 */
	void setRanker(std::string  ranker);
	/*! \brief Get The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	long long getScoreThreshold();

	/*! \brief Set The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	void setScoreThreshold(long long  score_threshold);

private:
	std::string ranker;
	long long score_threshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FileSearchRankingOptions_H_ */
