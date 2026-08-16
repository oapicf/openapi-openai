
/*
 * VectorStoreObject_file_counts.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VectorStoreObject_file_counts_H_
#define TINY_CPP_CLIENT_VectorStoreObject_file_counts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VectorStoreObject_file_counts{
public:

    /*! \brief Constructor.
	 */
    VectorStoreObject_file_counts();
    VectorStoreObject_file_counts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreObject_file_counts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of files that are currently being processed.
	 */
	int getInProgress();

	/*! \brief Set The number of files that are currently being processed.
	 */
	void setInProgress(int  in_progress);
	/*! \brief Get The number of files that have been successfully processed.
	 */
	int getCompleted();

	/*! \brief Set The number of files that have been successfully processed.
	 */
	void setCompleted(int  completed);
	/*! \brief Get The number of files that have failed to process.
	 */
	int getFailed();

	/*! \brief Set The number of files that have failed to process.
	 */
	void setFailed(int  failed);
	/*! \brief Get The number of files that were cancelled.
	 */
	int getCancelled();

	/*! \brief Set The number of files that were cancelled.
	 */
	void setCancelled(int  cancelled);
	/*! \brief Get The total number of files.
	 */
	int getTotal();

	/*! \brief Set The total number of files.
	 */
	void setTotal(int  total);


    private:
    int in_progress{};
    int completed{};
    int failed{};
    int cancelled{};
    int total{};
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreObject_file_counts_H_ */
