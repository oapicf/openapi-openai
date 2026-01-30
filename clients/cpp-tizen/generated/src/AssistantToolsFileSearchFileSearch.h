/*
 * AssistantToolsFileSearch_file_search.h
 *
 * Overrides for the file search tool.
 */

#ifndef _AssistantToolsFileSearch_file_search_H_
#define _AssistantToolsFileSearch_file_search_H_


#include <string>
#include "FileSearchRankingOptions.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Overrides for the file search tool.
 *
 *  \ingroup Models
 *
 */

class AssistantToolsFileSearch_file_search : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantToolsFileSearch_file_search();
	AssistantToolsFileSearch_file_search(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantToolsFileSearch_file_search();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	 */
	int getMaxNumResults();

	/*! \brief Set The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
	 */
	void setMaxNumResults(int  max_num_results);
	/*! \brief Get 
	 */
	FileSearchRankingOptions getRankingOptions();

	/*! \brief Set 
	 */
	void setRankingOptions(FileSearchRankingOptions  ranking_options);

private:
	int max_num_results;
	FileSearchRankingOptions ranking_options;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantToolsFileSearch_file_search_H_ */
