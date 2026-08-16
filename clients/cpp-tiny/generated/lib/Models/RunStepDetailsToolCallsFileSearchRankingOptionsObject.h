
/*
 * RunStepDetailsToolCallsFileSearchRankingOptionsObject.h
 *
 * The ranking options for the file search.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The ranking options for the file search.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchRankingOptionsObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFileSearchRankingOptionsObject();
    RunStepDetailsToolCallsFileSearchRankingOptionsObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFileSearchRankingOptionsObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ranker used for the file search.
	 */
	std::string getRanker();

	/*! \brief Set The ranker used for the file search.
	 */
	void setRanker(std::string  ranker);
	/*! \brief Get The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	long getScoreThreshold();

	/*! \brief Set The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	void setScoreThreshold(long  score_threshold);


    private:
    std::string ranker{};
    long score_threshold{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_ */
