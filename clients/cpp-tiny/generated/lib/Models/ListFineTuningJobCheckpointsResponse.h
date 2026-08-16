
/*
 * ListFineTuningJobCheckpointsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListFineTuningJobCheckpointsResponse_H_
#define TINY_CPP_CLIENT_ListFineTuningJobCheckpointsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuningJobCheckpoint.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListFineTuningJobCheckpointsResponse{
public:

    /*! \brief Constructor.
	 */
    ListFineTuningJobCheckpointsResponse();
    ListFineTuningJobCheckpointsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListFineTuningJobCheckpointsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<FineTuningJobCheckpoint> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuningJobCheckpoint> data);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getFirstId();

	/*! \brief Set 
	 */
	void setFirstId(std::string  first_id);
	/*! \brief Get 
	 */
	std::string getLastId();

	/*! \brief Set 
	 */
	void setLastId(std::string  last_id);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);


    private:
    std::list<FineTuningJobCheckpoint> data;
    std::string object{};
    std::string first_id{};
    std::string last_id{};
    bool has_more{};
};
}

#endif /* TINY_CPP_CLIENT_ListFineTuningJobCheckpointsResponse_H_ */
